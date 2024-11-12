package org.example.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaTopicConfig {
    public NewTopic javaguidesTopic(){
        return TopicBuilder.name("javaguides")
                .build();
    }
}
