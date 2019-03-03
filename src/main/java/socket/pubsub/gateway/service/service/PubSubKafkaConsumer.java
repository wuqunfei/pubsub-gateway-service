package socket.pubsub.gateway.service.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class PubSubKafkaConsumer {
    private static final Logger logger = LoggerFactory.getLogger(PubSubKafkaConsumer.class);

    @KafkaListener(topics = {"il5k22ai-events"})
    public void listenEvents(String message) {
        logger.info("get Message:" + message);
    }

}
