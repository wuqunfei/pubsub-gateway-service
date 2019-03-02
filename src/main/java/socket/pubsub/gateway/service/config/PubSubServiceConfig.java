package socket.pubsub.gateway.service.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "pubsub")
public class PubSubServiceConfig {
    private String host;
    private Integer port;
    private Integer pingTimeout;
    private Integer pintInterval;
    private Integer upgradeTimeout;


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getPingTimeout() {
        return pingTimeout;
    }

    public void setPingTimeout(Integer pingTimeout) {
        this.pingTimeout = pingTimeout;
    }

    public Integer getPintInterval() {
        return pintInterval;
    }

    public void setPintInterval(Integer pintInterval) {
        this.pintInterval = pintInterval;
    }

    public Integer getUpgradeTimeout() {
        return upgradeTimeout;
    }

    public void setUpgradeTimeout(Integer upgradeTimeout) {
        this.upgradeTimeout = upgradeTimeout;
    }
}
