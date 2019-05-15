package com.jk;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@ImportResource("spring-dubbo-consumer.xml")
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class Consumer512zyApplication {

    public static void main(String[] args) {
        SpringApplication.run(Consumer512zyApplication.class, args);
    }

}
