package com.example.kafkaAsyncTest.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaMessagePublisher {

    private final KafkaTemplate<String, Object> exactlyOnceKafkaTemplate;
    private final KafkaTemplate<String, Object> defaultKafkaTemplate;


}
