package socket.pubsub.gateway.service.service;

import com.corundumstudio.socketio.SocketIOServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class PusSubServerRunner implements CommandLineRunner {

    private final SocketIOServer socketIOServer;
    private static final Logger logger = LoggerFactory.getLogger(PusSubServerRunner.class);

    @Autowired
    public PusSubServerRunner(SocketIOServer socketIOServer) {
        this.socketIOServer = socketIOServer;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("PubSub Socket Server is starting...");
        socketIOServer.startAsync();
    }
}
