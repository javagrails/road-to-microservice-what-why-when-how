package bkorg.msconsole.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsConsoleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsConsoleApplication.class, args);
    }

}
