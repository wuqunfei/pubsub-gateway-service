package socket.pubsub.gateway.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class PubsubGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PubsubGatewayServiceApplication.class, args);
    }

}
