package com.kafka.kafkatest.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("spring.kafka")
@Getter
@Setter
public class KafkaProperties {
    public static final String CONSUMER_GROUP_ID = "testGroup";

    private String bootStrapServers;
}