package socket.pubsub.gateway.service.component;

import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.annotation.OnConnect;
import com.corundumstudio.socketio.annotation.OnDisconnect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.UUID;


@Component
public class MessageHandler {

    private final SocketIOServer socketIOServer;

    private final RedisTemplate<String, String> redisTemplate;

    private static final Logger logger = LoggerFactory.getLogger(MessageHandler.class);

    @Autowired
    public MessageHandler(SocketIOServer socketIOServer, RedisTemplate redisTemplate) {
        this.socketIOServer = socketIOServer;
        this.redisTemplate = redisTemplate;
    }

    @OnConnect
    public void onConnect(@NotNull SocketIOClient client) {
        UUID sessionId = client.getSessionId();
        logger.info(sessionId.toString());
    }

    @OnDisconnect
    public void onDisConnect(@NotNull SocketIOClient client) {
        UUID sessionId = client.getSessionId();
        logger.info(sessionId.toString());
        client.disconnect();
    }


}
