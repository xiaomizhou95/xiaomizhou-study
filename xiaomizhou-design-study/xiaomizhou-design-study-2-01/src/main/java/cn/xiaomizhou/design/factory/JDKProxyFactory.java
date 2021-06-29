package cn.xiaomizhou.design.factory;

import cn.xiaomizhou.design.workshop.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Description
 * @Author Rice
 * @Date 2021/6/29 17:32
 * @Version V1.0
 */
public class JDKProxyFactory {

    public static <T> T getProxy(Class clazz, Class<? extends ICacheAdapter> cacheAdapter) throws Exception {
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter.newInstance());

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        Object proxy = Proxy.newProxyInstance(classLoader, new Class[]{clazz}, handler);

        return (T) proxy;
    }

}
