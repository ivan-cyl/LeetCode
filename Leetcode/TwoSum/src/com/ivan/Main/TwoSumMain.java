package com.ivan.Main;

/**
 * 时间复杂度O(n^2)
 * 空间复杂度O(1)
 *
 * 使用传统方法较为容易理解，但此解决方法并不是最优解，最优解方法时间复杂度为O(n)
 */

public class TwoSumMain {
    public int[] TwoSum(int[] array, int x) {
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (x == array[i] + array[j] && i != j) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}
