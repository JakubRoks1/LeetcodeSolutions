package org.example.Challenges.RunningSumof1dArray1480;

public class RunningSumof1dArray1480 {
    public int[] runningSum(int[] nums) {
        if(nums == null || nums.length == 0){
            return new int[0];
        }

        int[] result = new int[nums.length];
        result[0] = nums[0];

        for(int i=1;i<nums.length;i++) {
            result[i] = result[i-1] + nums[i];
        }

        return result;
    }
}
