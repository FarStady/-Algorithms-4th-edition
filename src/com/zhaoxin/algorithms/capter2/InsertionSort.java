package com.zhaoxin.algorithms.capter2;

import com.zhaoxin.algorithms.utils.SortUtils;
import com.zhaoxin.algorithms.utils.SortUtils.*;

import java.util.concurrent.CompletableFuture;

import static com.zhaoxin.algorithms.utils.SortUtils.*;
import static com.zhaoxin.algorithms.utils.SortUtils.show;

/**
 * @program: Algorithms_4th_edition
 * @description: 插入排序
 * @author: ZhaoXin
 * @create: 2021-05-14 18:42
 **/
public class InsertionSort {
    public static void main(String[] args) {
        /**
         *      插入排序:
         *      假设索引i左边的数组是有序的,将索引为i的值依次与它左边的数相互比较,如果索引为i的值较小,
         *      那么交换两数,如果遇到一个比他小的数就停止比较.
         *      一开始i = 1,很明显他左边的数只有一个肯定有序,那么如果他比它左边的数小则交换,否则不交换;
         *      i = 2时,它左边的数也有序了...
         *
         */

        //sotr1();
        //sort2();
    }

    /**
     * @Description: 书中给出的插入排序算法
     * @Param: []
     * @return: void
     * @Author: ZhaoXin
     * @Date: 2021/5/14-20:23
     */
    private static void sotr1() {
        // 获得数组
        Comparable[] arr = SortUtils.getArr();

        //循环遍历数组,i左边的数组说有序的,i是现在要排序的位置
        for (int i = 1; i < arr.length; i++) {
            // 从i开始倒着遍历数组,发现比它大的数则交换,否则退出循环
            for (int j = i; j > 0; j--){
                if (less(arr[j],arr[j - 1])){
                    exch(arr,j,j - 1);
                } else {
                    break;
                }
            }
        }

        //判断是否已经排好序并打印
        System.out.println(isSorted(arr));
        show(arr);
    }

    /**
    * @Description: 练习2.1.25,不用交换的插入排序(我也不知道是否正确...)
    * @Param: []
    * @return: void
    * @Author: ZhaoXin
    * @Date: 2021/5/14-20:43
    */
    private static void sort2() {
        // 获得数组
        Comparable[] arr = SortUtils.getArr();

        //循环遍历数组,i左边的数组是有序的
        for (int i = 1; i < arr.length; i++) {
            // 记录arr[i]的值
            Comparable now = arr[i];

            //用一个变量记录j出循环时是多少,便于放入arr[i]
            int j;

            // 从i开始倒着遍历数组,如果遍历到的那个数比arr[i]大,则那个数右移一位.
            for (j = i - 1; j >= 0; j--){
                if (less(now,arr[j])){
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            // 由于比arr[i]大的都右移了一位,现在空出来一个位置,将arr[i]放在那里
            // 空出来的位置不是arr[j],arr[j]是小于等于arr[i]的,空出来的是arr[j+1]
            arr[j + 1] = now;
        }

        //判断是否已经排好序并打印
        System.out.println(isSorted(arr));
        show(arr);
    }
}