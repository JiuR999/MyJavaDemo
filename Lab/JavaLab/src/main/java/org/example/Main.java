package org.example;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        Calculator proxy = (Calculator) Myproxy.getProxy(new CalculatorImpl(),new MyIntercpter());

        proxy.add(3,4);
//        Scanner scanner = new Scanner(System.in);
//        String next = scanner.next();
//        String[] s = next.split(" ");
//        System.out.println(s.length);
    }
}