package org.example;

import java.lang.reflect.Proxy;

public class Myproxy {

    static Object getProxy(Object target,Intercep intercep){
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class[] interfaces = target.getClass().getInterfaces();

        Object proxy = Proxy.newProxyInstance(classLoader
                , interfaces, new MyHandler(target,intercep));
        return proxy;
    }
}
