package com.ivan.Test;

import com.ivan.Main.TwoSumMain;
import com.ivan.Main.TwoSumMain1;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Question
 *         Given an array of integers, return indices of the two numbers such that they add up to a
 *         specific target.You may assume that each input would have exactly one solution, and you
 *         may not use the same element twice.
 *
 * Example
 *         Given nums = [2, 7, 11, 15], target = 9,
 *         Because nums[0] + nums[1] = 2 + 7 = 9,
 *         return [0, 1]
 */

public class TwoSumTest {
    public static void main(String[] args) {
        int[] i=new int[]{1,2,3,4,5,6};
        TwoSumMain m=new TwoSumMain();
        TwoSumMain1 m1=new TwoSumMain1();
        assertThat(m.TwoSum(i,10), is(new int[]{3, 5}));
        assertThat(m1.TwoSum1(i,10), is(new int[]{3, 5}));

    }
}
