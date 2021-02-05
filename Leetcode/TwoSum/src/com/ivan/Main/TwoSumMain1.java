package com.ivan.Main;

/**
 * 时间复杂度O(n)
 * 空间复杂度O(n)
 * <p>
 * 由TwoSumMain1.java可知，传统方法难以解决此问题，此时选择何种数据结构就变得格外重要
 * 我们不能使用for语句嵌套方法来获取元素，因此我们使用的数据类型应该包括key和value
 */

import java.util.HashMap;

public class TwoSumMain1 {
    public int[] TwoSum1(int[] array, int x) {
        HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < x) temp.put(x - array[i], i);
            else temp.put(-1, i);
        }
        for (int j = 0; j < array.length; j++) {
            if (temp.containsKey(array[j])&&temp.get(array[j])!=j) {
                result[0] = temp.get(array[j]);
                result[1] = j;
            }
        }
        return result;
    }
}