package cn.taroco.common.redis.limit.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 限流配置
 *
 * @author liuht
 * @date 2018/8/15 9:10
 */
@Data
@ConfigurationProperties("taroco.redis.limit")
public class RedisLimitProperties {

    /**
     * 是否启用限流
     */
    private Boolean enabled;

    /**
     * 具体限流value
     */
    private int value;
}
