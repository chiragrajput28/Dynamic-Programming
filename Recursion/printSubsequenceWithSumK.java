package Recursion;

import java.util.ArrayList;

public class printSubsequenceWithSumK {
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,2};
        int k = 4;
        int sum = 0;
        int n = arr.length;
        ArrayList<Integer> ds = new ArrayList<>();
        print(0, ds, arr, k, n, sum);

    }
    public static void print(int idx, ArrayList<Integer> ds, int arr[], int k, int n, int sum) {
        if(idx == n) {
            if(sum == k) {
                for (int i : ds) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            return;
        }
        ds.add(arr[idx]);
        sum += arr[idx];
        print(idx + 1, ds, arr, k, n, sum);
        ds.remove(ds.indexOf(arr[idx]));
        sum -= arr[idx];
        print(idx + 1, ds, arr, k, n, sum);
    }
}
