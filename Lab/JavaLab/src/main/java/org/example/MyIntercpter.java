package org.example;

import java.lang.reflect.Method;

public class MyIntercpter implements Intercep{
    @Override
    public void before(Method method) {
        System.out.println("开始执行"+method.getName()+"打印日志");
    }

    @Override
    public void after(Method method) {
        System.out.println(method.getName()+"执行方后打印日志");
    }
}
