package com.company;


import javax.sound.midi.Soundbank;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {

        A a1 = new A();
        Class c = a1.getClass();
        Method print = c.getMethod("print", int.class, int.class);
        int invoke = (int)print.invoke(a1, 10, 20);
        System.out.println(invoke);

    }

}

class A {
    public int print(int x,int y){
      return x+y;
    }
}