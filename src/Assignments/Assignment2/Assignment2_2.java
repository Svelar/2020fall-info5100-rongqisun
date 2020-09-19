package Assignments.Assignment2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * The deadline of this assignment is 09/25/2020 23:59 PST.
 * Please feel free to contact Yafei and Yaqi for any questions.
 */

public class Assignment2_2 {
    /**
     * Given an integer array nums, find the contiguous subarray (containing at least one number)
     * which has the largest sum and outprint its sum.
     *
     * Example 1:
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     *
     * Example 2:
     * Input: nums = [1]
     * Output: 1
     */
    public int maxSubArray(int[] nums) {
        List<Integer> sums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            sums.add(sum);
            for (int j = i+1; j < nums.length; j++) {
                sum += nums[j];
                sums.add(sum);
            }
        }
        System.out.println("Array of sums:");
        System.out.println(sums);
        System.out.println("The largest sum: ");
        sums.sort(Comparator.reverseOrder());
        return  sums.get(0);

    }

    public static void main(String[] args) {
        //write your code here
        Assignment2_2 Assignment = new Assignment2_2();
        int[] numsA = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int[] numsB = new int[]{1};

        System.out.println("numsA: ");
        for (int x:
             numsA) {
            System.out.printf("%d ",x);
        }
        System.out.println();
        System.out.println(Assignment.maxSubArray(numsA));

        System.out.println();
        System.out.println("numsB: ");
        for (int x:
                numsB) {
            System.out.printf("%d ",x);
        }
        System.out.println();
        System.out.println(Assignment.maxSubArray(numsB));

/*
       Output:

       numsA:
        -2 1 -3 4 -1 2 1 -5 4
        Array of sums:
        [-2, -1, -4, 0, -1, 1, 2, -3, 1, 1, -2, 2, 1, 3, 4, -1, 3, -3, 1, 0, 2, 3, -2, 2, 4, 3, 5, 6, 1, 5, -1, 1, 2, -3, 1, 2, 3, -2, 2, 1, -4, 0, -5, -1, 4]
        The largest sum:
        6

        numsB:
        1
        Array of sums:
        [1]
        The largest sum:
        1

        */

    }
}
