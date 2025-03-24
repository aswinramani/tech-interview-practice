
/*
Problem Statement:

Given an integer array arr, find and return all unique triplets [arr[i], arr[j], arr[k]],
where the indexes satisfy this condition:
    i != j != k
and the sum of the elements arr[i] + arr[j] + arr[k] == 0.
 */

package TwoPointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ThreeSum {

    private static void validTriplets(int[] arr) {
        System.out.println("For input : " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("sorted : " + Arrays.toString(arr));
        int i = 0;
        int j = i + 1;
        int k = j + 1;
        List<List<Integer>> triplets = new ArrayList<>();
        while (k < arr.length) {
            if (arr[i] + arr[j] + arr[k]  == 0 ) {
                System.out.println("yes!");
                List<Integer> triplet = new ArrayList<>();
                triplet.add(arr[i]);
                triplet.add(arr[j]);
                triplet.add(arr[k]);
                triplets.add(triplet);
            }
            k++;
        }
        System.out.println("output : " + triplets.toString());
    }

    public static void init() {
        int[][] tests = {
                {-1,0,1,2,-1,-4}
        };
        for (int[] test: tests) {
            ThreeSum.validTriplets(test);
        }
    }
}
