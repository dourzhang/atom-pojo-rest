package com.watent.pojo;

import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Pojo Auto Configuration
 * <p>
 * Created by Atom on 2017/7/11.
 */
@Configuration
public class PojoAutoConfiguration {

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.BASIC;
    }
}
