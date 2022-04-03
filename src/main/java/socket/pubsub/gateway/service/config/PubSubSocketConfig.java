package socket.pubsub.gateway.service.config;

import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.annotation.SpringAnnotationScanner;
import com.corundumstudio.socketio.store.RedissonStoreFactory;
import org.redisson.api.RedissonClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
public class PubSubSocketConfig {

    @Resource
    private PubSubSocketProperties pubSubSocketProperties;

    private static final Logger logger = LoggerFactory.getLogger(PubSubSocketConfig.class);


    @Bean
    public RedissonStoreFactory createRedissonStoreFactory(RedissonClient redissonClient) {
        return new RedissonStoreFactory(redissonClient);
    }


    @Bean
    public SocketIOServer socketIOServer(RedissonStoreFactory storeFactory) {
        com.corundumstudio.socketio.Configuration config = new com.corundumstudio.socketio.Configuration();
        config.setHostname(pubSubSocketProperties.getHost());
        config.setPort(pubSubSocketProperties.getPort());
        config.setPingTimeout(pubSubSocketProperties.getPingTimeout());
        config.setPingInterval(pubSubSocketProperties.getPintInterval());
        config.setUpgradeTimeout(pubSubSocketProperties.getUpgradeTimeout());
        config.setBossThreads(pubSubSocketProperties.getBossThreads());
        config.setWorkerThreads(pubSubSocketProperties.getWorkerThreads());
        config.setUseLinuxNativeEpoll(pubSubSocketProperties.isUseLinuxNativeEpoll());
        config.setStoreFactory(storeFactory);
        SocketIOServer socketIOServer = new SocketIOServer(config);
        return socketIOServer;
    }

    @Bean
    public SpringAnnotationScanner springAnnotationScanner(SocketIOServer socketServer) {
        return new SpringAnnotationScanner(socketServer);
    }
}
