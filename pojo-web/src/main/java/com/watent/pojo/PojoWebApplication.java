package com.watent.pojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Pojo Web Application
 * <p>
 * Created by Atom on 2017/7/12.
 */
@EnableFeignClients
//@EnableDiscoveryClient
@SpringBootApplication
public class PojoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PojoWebApplication.class, args);
    }
}
