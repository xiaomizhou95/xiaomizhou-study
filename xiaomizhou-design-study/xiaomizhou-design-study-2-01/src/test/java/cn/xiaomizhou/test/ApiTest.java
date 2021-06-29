package cn.xiaomizhou.test;

import cn.xiaomizhou.design.factory.JDKProxyFactory;
import cn.xiaomizhou.design.workshop.ICacheAdapter;
import cn.xiaomizhou.design.workshop.impl.EGMCacheAdapter;
import org.junit.Test;

/**
 * @Description
 * @Author Rice
 * @Date 2021/6/29 17:37
 * @Version V1.0
 */
public class ApiTest {

    @Test
    public void test_01() throws Exception {
        ICacheAdapter proxy_EGM = JDKProxyFactory.getProxy(ICacheAdapter.class, EGMCacheAdapter.class);
        proxy_EGM.set("1", "小米粥");
        String value = proxy_EGM.get("1");
        System.out.println("EGM 获取value:" + value);
        proxy_EGM.del("1");
    }
}
