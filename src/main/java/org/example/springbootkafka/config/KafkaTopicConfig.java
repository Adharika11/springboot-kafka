package org.example.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaTopicConfig {
    @Bean
    public NewTopic javaguidesTopic(){
        return TopicBuilder.name("javaguides")
                //.partition(5) - but here we are making default partitions given by kafka
                .build();
    }
}
