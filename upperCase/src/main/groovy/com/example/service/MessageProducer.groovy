package com.example.service

import com.example.entity.User
import io.micronaut.configuration.kafka.annotation.KafkaClient
import io.micronaut.configuration.kafka.annotation.Topic

@KafkaClient
interface MessageProducer {

    @Topic("demo-topic")
    void sendMessage(def user)

}
