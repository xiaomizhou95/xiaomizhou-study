package cn.xiaomizhou.design.redis;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author Rice
 * @Date 2021/6/29 17:08
 * @Version V1.0
 */
public class RedisUtils {
    private static final Logger logger = LoggerFactory.getLogger(RedisUtils.class);

    private Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String get(String key) {
        logger.info("Redis 获取数据 key:{}", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        logger.info("Redis 写入数据 key:{}, val:{}", key, value);
        dataMap.put(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        logger.info("Redis 写入数据 key:{}, val:{}, timeout:{}, timeUnit:{}", key, value, timeout, timeUnit);
        dataMap.put(key, value);
    }

    public void del(String key) {
        logger.info("Redis 删除数据 key:{}", key);
        dataMap.remove(key);
    }
}
