package com.zhaoxin.algorithms.capter2;

import com.zhaoxin.algorithms.utils.SortUtils;

import static com.zhaoxin.algorithms.utils.SortUtils.*;

/**
 * @program: Algorithms_4th_edition
 * @description: 选择排序
 * @author: ZhaoXin
 * @create: 2021-05-14 18:14
 **/
public class SelectionSort {
    public static void main(String[] args) {
        /**
         * 选择排序:
         *      首先从数组中循环遍历出最小的值,将最小值与第一个位置交换,接着遍历出剩下的最小值,与第二个位置交换...
         *      直到整个数组有序
         */

        // 获得数组
        Comparable[] arr = SortUtils.getArr();

        // 遍历循环数组,i之前的数据已经排好序,i是要和最小值交换的位置
        for (int i = 0; i < arr.length; i++) {
            // min指向当前最小值的索引
            int min = i;

            // 循环找出最小值
            for (int j = i;j < arr.length; j++){
                //如果arr[j]小于当前最小值,则min指向j
                if (less(arr[j],arr[min])){
                    min = j;
                }
            }
            // 交换最小值与i的值
            exch(arr,i,min);
        }

        //判断是否已经排好序并打印
        System.out.println(isSorted(arr));
        show(arr);
    }
}