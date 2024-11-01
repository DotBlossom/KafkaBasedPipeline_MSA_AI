package com.example.kafkaAsyncTest.controller;

import com.example.kafkaAsyncTest.entity.Result;
import com.example.kafkaAsyncTest.service.KafkaMessagePublisher;
import com.example.kafkaAsyncTest.service.KafkaMessageSubscriber;
import com.example.kafkaAsyncTest.service.defaultService.ResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test/v2")
public class deferredRestAPIController {

    private final ResultService resultService;

    private final KafkaMessagePublisher kafkaMessagePublisher;
    private final KafkaMessageSubscriber kafkaMessageSubscriber;


    @PostMapping
    public DeferredResult<ResponseEntity<Result>> deferredCreateResult(@RequestBody Result resReq) {
        DeferredResult<ResponseEntity<Result>> deferredResult = new DeferredResult<>();

        Result res = resultService.createResult(resReq);

        kafkaMessagePublisher.sendObjectToTopic(res);

        deferredResult.setResult(ResponseEntity.ok(res));

        return deferredResult;
    }


}
