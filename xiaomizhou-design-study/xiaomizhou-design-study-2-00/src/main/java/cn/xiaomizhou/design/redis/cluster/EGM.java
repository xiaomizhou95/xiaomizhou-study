package cn.xiaomizhou.design.redis.cluster;

import cn.xiaomizhou.design.redis.RedisUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author Rice
 * @Date 2021/6/29 17:16
 * @Version V1.0
 */
public class EGM {
    private static final Logger logger = LoggerFactory.getLogger(EGM.class);

    private Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String gain(String key) {
        logger.info("EGM 获取数据 key:{}", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        logger.info("EGM 写入数据 key:{}, val:{}", key, value);
        dataMap.put(key, value);
    }

    public void setEx(String key, String value, long timeout, TimeUnit timeUnit) {
        logger.info("EGM 写入数据 key:{}, val:{}, timeout:{}, timeUnit:{}", key, value, timeout, timeUnit);
        dataMap.put(key, value);
    }

    public void delete(String key) {
        logger.info("EGM 删除数据 key:{}", key);
        dataMap.remove(key);
    }
}
