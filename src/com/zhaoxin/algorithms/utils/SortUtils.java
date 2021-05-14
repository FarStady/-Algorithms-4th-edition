package com.zhaoxin.algorithms.utils;

import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

/**
 * @program: Algorithms_4th_edition
 * @description: 第二章所需要的工具类
 * @author: ZhaoXin
 * @create: 2021-05-14 17:31
 **/
public class SortUtils {
    /**
     * 比较a是否小于b
     * @param a 实现了Comparable接口的对象
     * @param b 实现了Comparable接口的对象
     * @return 如果a小于b,则返回true;否则返回false
     */
    public static boolean less(Comparable a, Comparable b){
        //传入Comparable接口,确保传入的参数都可以排序

        return a.compareTo(b) < 0;
    }

    /**
     * 交换索引为i和索引为j的值
     * @param a 需要操作的数组
     * @param i 索引i
     * @param j 索引j
     */
    public static void exch(Comparable[] a, int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * 打印数组
     * @param a 需要打印的数组
     */
    public static void show(Comparable[] a){
        for (Object o : a) {
            System.out.print(o + "");
            System.out.println();
        }
    }

    /**
     * 判断两个数组是否有序
     * @param a 传入的数组
     * @return 如果有序,输出true;否则输出false
     */
    public static boolean isSorted(Comparable[] a){
        int len = a.length;
        for (int i = 1; i < len; i++) {
            if (less(a[i],a[i - 1])){
                // 如果后一个元素小于前一个元素,返回false
                return false;
            }
        }
        return true;
    }

    /**
     * 获得数组
     * @return 返回输入的数组
     */
    public static Comparable[] getArr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度:");
        int n = sc.nextInt();
        Comparable[] a = new Comparable[n];
        System.out.println("请输入数组:");
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            a[i] = m;
        }
        return a;
    }
}