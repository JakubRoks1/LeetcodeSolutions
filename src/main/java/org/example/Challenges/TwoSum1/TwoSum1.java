package org.example.Challenges.TwoSum1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        // Create a map to store the numbers and their indices.
        Map<Integer, Integer> numMap = new HashMap<>();
        // Iterate over the numbers in the array.
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current number.
            int complement = target - nums[i];
            // If the complement exists in the map, return the indices.
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            // Otherwise, add the current number and its index to the map.
            numMap.put(nums[i], i);
        }
        // If no two numbers sum up to the target, return null.
        return null;
    }
}
