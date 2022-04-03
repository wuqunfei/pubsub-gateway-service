package socket.pubsub.gateway.service.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "pubsub")
public class PubSubSocketProperties {
    private String host;
    private Integer port;
    private Integer pingTimeout;
    private Integer pintInterval;
    private Integer upgradeTimeout;
    private Integer bossThreads;
    private Integer workerThreads;
    private boolean useLinuxNativeEpoll;


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

    public Integer getBossThreads() {
        return bossThreads;
    }

    public void setBossThreads(Integer bossThreads) {
        this.bossThreads = bossThreads;
    }

    public Integer getWorkerThreads() {
        return workerThreads;
    }

    public void setWorkerThreads(Integer workerThreads) {
        this.workerThreads = workerThreads;
    }

    public boolean isUseLinuxNativeEpoll() {
        return useLinuxNativeEpoll;
    }

    public void setUseLinuxNativeEpoll(boolean useLinuxNativeEpoll) {
        this.useLinuxNativeEpoll = useLinuxNativeEpoll;
    }
}
