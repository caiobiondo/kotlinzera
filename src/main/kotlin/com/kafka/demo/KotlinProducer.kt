package com.kafka.demo

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class KotlinProducer(private val kafkaTemplate: KafkaTemplate<String, String>) {

  fun send(message: String) {
    kafkaTemplate.send("simple-message-topic", message)
  }

}