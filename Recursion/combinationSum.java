/**
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations 
of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency 
of at least one of the chosen numbers is different.

It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.

Example 2:

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]

Example 3:

Input: candidates = [2], target = 1
Output: []
 */

package Recursion;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<>();
        int[] arr = {2,3,6,7};
        res = combinations(arr, 7);
        for(List<Integer> x: res) {
            for(int y: x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> combinations (int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, target, ans, arr, new ArrayList<>());
        return ans;
    }

    public static void findCombination(int idx, int target, List<List<Integer>> ans, int[] arr, ArrayList<Integer> ds) {
        int n = arr.length;
        if(idx == n) {
            if(target == 0) {
                ans.add(new ArrayList<Integer>(ds));
            }
            return;
        }
        if(arr[idx] <= target) {
            ds.add(arr[idx]);
            findCombination(idx, target - arr[idx], ans, arr, ds);
            ds.remove(ds.size() - 1);
        }
        findCombination(idx + 1, target, ans, arr, ds);
    }
}
