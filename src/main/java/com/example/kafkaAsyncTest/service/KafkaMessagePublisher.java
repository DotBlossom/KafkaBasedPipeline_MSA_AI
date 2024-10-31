package com.example.kafkaAsyncTest.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaMessagePublisher {

    @Autowired
    private KafkaTemplate<String, Object> exactlyOnceKafkaTemplate;

    @Autowired
    private KafkaTemplate<String, Object> defaultKafkaTemplate;


}
