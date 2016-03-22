package joee.mservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAutoConfiguration
@EnableDiscoveryClient
public class StuffServer {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "stuff-server");

        SpringApplication.run( StuffServer.class, args );
    }
}
