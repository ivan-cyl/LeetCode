package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    //暴力解法,时间复杂度：O（N^2);空间复杂度O（1）
    public int[] twoSum1(int[] ints, int target) {
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = i + 1; j < ints.length - 1; j++) {
                if (ints[i] + ints[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    //哈希表，时间复杂度：O(N)；空间复杂度：O(N)
    public int[] twoSum2(int[] ints,int target){
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < ints.length; i++) {
            if(hashtable.containsKey(target-ints[i])){
                return new int[] {hashtable.get(target-ints[i])};
            }
            hashtable.put(ints[i],i);
        }
        return new int[0];
    }
}
