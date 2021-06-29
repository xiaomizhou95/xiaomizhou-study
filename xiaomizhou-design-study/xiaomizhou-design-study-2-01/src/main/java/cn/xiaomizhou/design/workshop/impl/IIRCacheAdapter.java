package cn.xiaomizhou.design.workshop.impl;

import cn.xiaomizhou.design.redis.cluster.IIR;
import cn.xiaomizhou.design.workshop.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author Rice
 * @Date 2021/6/29 17:25
 * @Version V1.0
 */
public class IIRCacheAdapter implements ICacheAdapter {

    private IIR iir = new IIR();

    @Override
    public String get(String key) {
        return iir.get(key);
    }

    @Override
    public void set(String key, String value) {
        iir.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        iir.del(key);
    }
}
