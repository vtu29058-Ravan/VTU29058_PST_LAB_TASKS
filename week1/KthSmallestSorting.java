<<<<<<<< HEAD:week1/KthSmallestSorting.java

import java.util.Arrays;

public class KthSmallestSorting {
    public static int findKthSmallest(int[] arr, int k) {
        // Edge case handling
        if (arr == null || k > arr.length || k <= 0) {
            throw new IllegalArgumentException("Invalid value of k or empty array");
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Return the element at k-1 index
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19, 1};
        int k = 3;
        
        System.out.println("The " + k + "rd smallest element is: " + findKthSmallest(arr, k));
    }
========

import java.util.Arrays;

public class week1_task6_KthSmallestSorting {
    public static int findKthSmallest(int[] arr, int k) {
        // Edge case handling
        if (arr == null || k > arr.length || k <= 0) {
            throw new IllegalArgumentException("Invalid value of k or empty array");
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Return the element at k-1 index
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19, 1};
        int k = 3;
        
        System.out.println("The " + k + "rd smallest element is: " + findKthSmallest(arr, k));
    }
>>>>>>>> 47aab43 (Add week1 and coursework files):week1/week1_task6_KthSmallestSorting.java
}