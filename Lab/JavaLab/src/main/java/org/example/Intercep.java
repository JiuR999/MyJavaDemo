package org.example;

import java.lang.reflect.Method;

public interface Intercep {
    void before(Method method);
    void after(Method method);
}
