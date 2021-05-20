package com.kafka.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka


@SpringBootApplication
@EnableKafka
@EnableConfigurationProperties(CustomConfigs::class)
class KafkaDemoApplication

fun main(args: Array<String>) {
	runApplication<KafkaDemoApplication>(*args)
}