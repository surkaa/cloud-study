package cn.surkaa.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 用于注册bean实例
 *
 * @author SurKaa
 */
@Configuration
public class BeanRegister {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}