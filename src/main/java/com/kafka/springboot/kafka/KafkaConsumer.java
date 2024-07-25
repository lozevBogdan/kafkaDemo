package com.kafka.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);


    //here we listen for new messages in topic - "javaguides" from groupId = "myGroup".
    // when some message is sent from producer in to kafka cluster topic, the consumer method below will listening about new messages from topic
    @KafkaListener(topics = "javaguides", groupId = "myGroup")
    public void consume(String message) {

        LOGGER.info(String.format("Message received -> %s", message));


    }

}
