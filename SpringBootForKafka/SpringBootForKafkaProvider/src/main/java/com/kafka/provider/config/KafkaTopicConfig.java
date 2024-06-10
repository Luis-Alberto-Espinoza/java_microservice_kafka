package com.kafka.provider.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.util.HashMap;
import java.util.Map;

@Configuration

public class KafkaTopicConfig {
    public NewTopic generateTopic() {
        Map<String, String> cofigurations = new HashMap<>();
        return TopicBuilder.name("NameNewTopic")
                .partitions(2)
                .replicas(2)
                .build();
    }
}
