package com.qy105.aaa.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author qy105孔佑森
 * @version 1.0
 * @Date 2019/12/3
 */
@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced
    RestTemplate getRestTemplate(){

        return new RestTemplate();
    }
}