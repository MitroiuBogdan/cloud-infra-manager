package com.yllu.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigurationManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationManagerApplication.class, args);
    }


}
