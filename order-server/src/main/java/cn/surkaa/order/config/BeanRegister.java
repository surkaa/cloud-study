package cn.surkaa.order.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
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

    /**
     * RestTemplate 用于调用其他服务 并且开启负载均衡
     *
     * @return RestTemplate
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

//    /**
//     * Ribbon负载均衡策略
//     *
//     * @return RandomRule 随机策略
//     */
//    @Bean
//    public IRule ribbonRule() {
//        return new RandomRule();
//    }

}
