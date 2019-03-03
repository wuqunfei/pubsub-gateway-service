package socket.pubsub.gateway.service.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PubSubKafkaProducer {
    private static final Logger logger = LoggerFactory.getLogger(PubSubKafkaProducer.class);
    private final KafkaTemplate<String, Object> kafkaTemplate;


    @Autowired
    public PubSubKafkaProducer(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    public void sendMessage(String topicName, Object value) {
        try {
            kafkaTemplate.send(topicName, value);
        } catch (Exception e) {
            logger.error("send failed", e);
        }
    }

}
