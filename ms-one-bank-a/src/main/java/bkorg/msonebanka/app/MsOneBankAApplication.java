package bkorg.msonebanka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsOneBankAApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsOneBankAApplication.class, args);
    }

}
