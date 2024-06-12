package org.example.Challenges.TwoSum167;

public class TwoSum167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length -1;
        while(numbers[left] + numbers[right] != target){
            int mid = (left+right)/2;
            if(numbers[left] + numbers[right] > target){
                if(numbers[left] + numbers[mid] >= target){
                    right = mid;
                } else {
                    right--;
                }
            } else {
                if(numbers[mid] + numbers[right] <= target){
                    left = mid;
                } else {
                    left++;
                }
            }
        }
        return new int[]{left + 1, right + 1};
    }
}
