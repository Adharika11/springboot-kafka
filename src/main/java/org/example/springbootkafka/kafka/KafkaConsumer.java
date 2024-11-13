package org.example.springbootkafka.kafka;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;



@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics="javaguides", groupId="myGroup") // whenever kafka producer sends a message ,
                                        // this consumer listens to this topic that is it has subscribed for it
    public void consume(String message){
        LOGGER.info(String.format("Message recieved -> %s",message));


    }

}

