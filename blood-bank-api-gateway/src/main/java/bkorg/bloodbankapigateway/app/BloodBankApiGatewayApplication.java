package bkorg.bloodbankapigateway.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class BloodBankApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BloodBankApiGatewayApplication.class, args);
    }

}
