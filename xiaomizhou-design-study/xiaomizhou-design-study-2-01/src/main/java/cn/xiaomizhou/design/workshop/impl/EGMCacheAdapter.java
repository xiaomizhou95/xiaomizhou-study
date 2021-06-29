package cn.xiaomizhou.design.workshop.impl;

import cn.xiaomizhou.design.redis.cluster.EGM;
import cn.xiaomizhou.design.workshop.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author Rice
 * @Date 2021/6/29 17:23
 * @Version V1.0
 */
public class EGMCacheAdapter implements ICacheAdapter {

    private EGM egm = new EGM();

    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        egm.delete(key);
    }
}
