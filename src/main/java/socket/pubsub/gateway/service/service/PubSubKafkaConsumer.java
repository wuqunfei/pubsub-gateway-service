package socket.pubsub.gateway.service.service;

import com.corundumstudio.socketio.SocketIOServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class PubSubKafkaConsumer {
    private static final Logger logger = LoggerFactory.getLogger(PubSubKafkaConsumer.class);

    @Autowired
    private SocketIOServer socketIOServer;

    @KafkaListener(topics = {"il5k22ai-events"})
    public void listenEvents(String message) {
        logger.info("get Message:" + message);
        socketIOServer.getBroadcastOperations().sendEvent("news", "Kafka:" + message + " at: " + new Date().toString());
    }

}
