package cn.huaming.redis;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@Configuration
public class RedisConfig {

    /**
     * @param factory
     * @return
     * @author piaoruiqing
     */
    @Bean
    @ConditionalOnMissingBean
    public RedisTemplate stringRedisTemplate(RedisConnectionFactory factory) {

        StringRedisTemplate template = new StringRedisTemplate();
        template.afterPropertiesSet();
        return template;
    }
}