package com.j2se.chapter01;

import java.util.ArrayList;

/**
 * @ahthor Kobe
 * @Create 2021-01-18 6:52 下午
 */
public class Hello extends HelloWorld {
    String string = "abc";

    public Hello() {
    }


    public void eat() {
        System.out.println("HelloWorl吃饭");
    }

        public static void main(String[]args){
            int i = 10;
            boolean i1 = true;

            ExtractMethod();


            ArrayList list = new ArrayList();
            new HelloWorld().method();
        }

    private static void ExtractMethod() {
        System.out.println("Hello11");
        System.out.println("Hello22");
    }

}

