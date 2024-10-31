package com.example.kafkaAsyncTest.service;

import com.example.kafkaAsyncTest.common.customKafkaFilterSet.DeduplicationFilterStrategy;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

public class KafkaMessageSubscriber {

    @KafkaListener(topics = "${kafkaPipeline.topic-name-1}", containerFactory = "exactlyOnceKafkaListenerContainerFactory")
    public void listen(ConsumerRecord<String, Object> record) {
        // ... 메시지 처리 로직 ...
    }
}
