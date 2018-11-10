package practice07;
/*
第二题：分析以下需求并实现
        1.通过键盘录入一个数字，作为数组的长度
        2.根据录入的数字，创建一个长度为该数字的数组
        3.通过随机数为数组中的每个元素进行赋值。随机数的范围在1-100之间
        4.求出数组中最大数字
        5.求出数组中的数字平均值
*/

import java.util.Random;
import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 3;
        int[] array = new int[num];
        Random random = new Random();
        int max = array[0];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int j = random.nextInt(100) + 1;
            array[i] = j;
            System.out.println(j);
            sum += j;
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("最大值是"+max);
        double ave = sum /array.length;
        System.out.println("平均值是"+ave);
    }
}

