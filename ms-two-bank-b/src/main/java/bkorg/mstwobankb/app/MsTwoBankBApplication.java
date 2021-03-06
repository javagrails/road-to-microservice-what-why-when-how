package bkorg.mstwobankb.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsTwoBankBApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsTwoBankBApplication.class, args);
    }

}
