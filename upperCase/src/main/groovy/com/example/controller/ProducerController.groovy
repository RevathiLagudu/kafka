package com.example.controller

import com.example.entity.User
import com.example.service.MessageProducer
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import jakarta.inject.Inject

@Controller("/send")
class ProducerController {

    @Inject
    MessageProducer messageProducer

    private Map<Integer,User>users=[:]
    private int nextUserId=1

    @Post
    String sendUser(@Body User user){

        int userId=nextUserId++
        users[userId]=user

        messageProducer.sendMessage(users)
        return "Message Sent: ${user}"
    }


//    @Get("/{message}")
//    String sendMessage(@QueryValue String message) {
//        messageProducer.sendMessage(message)
//        return "Message Sent: ${message}"
//    }



}
