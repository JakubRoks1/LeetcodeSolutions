package org.example.Challenges.NumberofGoodPairs;

import java.util.HashMap;
import java.util.Map;

public class NumberofGoodPairs1512 {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        int res = 0;

        for (int num: nums) {
            if (map.containsKey(num)) {
                res += map.get(num);
            }

            map.put(num, map.getOrDefault(num,0)+1);
        }
        return res;
    }
}
