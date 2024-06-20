package org.example.Challenges.IntersectionOfTwoArrays350;

import java.util.*;

public class IntersectionOfTwoArrays350 {
    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> numberCounts = new HashMap<>();
        // Iterate over the first array and fill the numberCounts map
        for (int number : nums1) {
            // Increment the count for the current number in the map
            numberCounts.put(number, numberCounts.getOrDefault(number, 0) + 1);
        }

        // List to store the intersection elements
        List<Integer> intersectionList = new ArrayList<>();
        // Iterate over the second array to find common elements
        for (int number : nums2) {
            // If the current number is in the map and count is greater than 0
            if (numberCounts.getOrDefault(number, 0) > 0) {
                // Add the number to the intersection list
                intersectionList.add(number);
                // Decrement the count for the current number in the map
                numberCounts.put(number, numberCounts.get(number) - 1);
            }
        }

        // Convert the list of intersection elements to an array
        int[] result = new int[intersectionList.size()];
        for (int i = 0; i < result.length; ++i) {
            result[i] = intersectionList.get(i);
        }

        // Return the final array containing the intersection of both input arrays
        return result;

    }
}
