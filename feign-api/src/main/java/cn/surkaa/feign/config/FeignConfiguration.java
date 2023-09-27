package cn.surkaa.feign.config;


import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * Feign配置类
 *
 * @author SurKaa
 */
public class FeignConfiguration {

    @Bean
    public Logger.Level level() {
        return Logger.Level.BASIC;
    }

}
