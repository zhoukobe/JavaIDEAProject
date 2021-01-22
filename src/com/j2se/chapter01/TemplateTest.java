package com.j2se.chapter01;


import com.j2se.module01.chapter01.ModuleTest;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * @ahthor Kobe
 * @Create 2021-01-21 11:18 上午
 */
public class TemplateTest {
    //prsf
    private static final int A = 10;
    private static final ModuleTest mt = new ModuleTest();

    //psf
    public static final int B = 20;
    //psfi  psfs
    public static final int C = 30;
    public static final String CHINE = "中国";

    public void methodAdd() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(678);
        //ifn快捷键
        if (list == null) {
            System.out.println("list 为空");
        }
        if (list != null) {
            System.out.println("list 不为空");
        }
        if (list == null) {

        }
        if (list != null) {

        }
    }

    public static void main(String[] args) {
        new TemplateTest().methodAdd();

        System.out.println("Hello");
        System.out.println("args = " + args);
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplateTest.main");
        int i = 100;
        System.out.println("i = " + i);
        System.out.println("args = " + Arrays.deepToString(args));
        int i1 = 100;
        int i2 = 100;
        System.out.println("i2 = " + i2);
        String[] arr = new String[]{"Tom", "Jerry", "Mouse", "zhengshuang"};
        //fori
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        System.out.println("------------------------1");
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("------------------------2");
        for (int j = 0; j < arr.length; j++) {
            String s = arr[j];
            System.out.println(s);
        }
        System.out.println("------------------------list for几何");
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(678);
        for (Object o : list) {
            System.out.println(o);
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            System.out.println(list.size());

        }
        for (int i3 = list.size() - 1; i3 >= 0; i3--) {
            System.out.println(list.size());
        }

    }
}
