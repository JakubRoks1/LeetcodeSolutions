package org.example;

import org.example.Challenges.ConverttheTemperature2469.ConverttheTemperature2469;
import org.example.Challenges.IntersectionOfTwoArrays350.IntersectionOfTwoArrays350;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        IntersectionOfTwoArrays350 solution = new IntersectionOfTwoArrays350();

        // Define two arrays for testing
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2};

        // Call the intersect method and store the result
        int[] result = solution.intersect(nums1, nums2);

        // Print the result
        System.out.println("Intersection: " + Arrays.toString(result));


    }
}