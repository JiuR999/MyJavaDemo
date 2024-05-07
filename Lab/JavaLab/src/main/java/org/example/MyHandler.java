package org.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.logging.Logger;

public class MyHandler  implements InvocationHandler {
    private Object target;
    private Intercep intercep;
    public MyHandler(Object target,Intercep intercep) {
        this.target = target;
        this.intercep = intercep;
    }

    //private final Logger logger = Logger.getLogger()
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        intercep.before(method);
        int res = (int) method.invoke(target,args);
        System.out.println("方法执行后，结果为"+ res);
        intercep.after(method);
        return res;
    }
}
