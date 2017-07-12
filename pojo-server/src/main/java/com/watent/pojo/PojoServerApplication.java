package com.watent.pojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Pojo Server Application
 * <p>
 * Created by Atom on 2017/7/12.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PojoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PojoServerApplication.class, args);
    }

}
