package Recursion;

import java.util.ArrayList;

class printAllSubsequence {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int n = arr.length;
        ArrayList<Integer> ds = new ArrayList<>(); 
        print(0, arr, ds, n);
    }
    public static void print(int idx, int[] arr, ArrayList<Integer> ds, int n) {
        if (idx == n) {
            if(ds.size() != 0) {
                for (int x : ds) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            return;
        }
        print(idx+1, arr, ds, n);
        ds.add(arr[idx]);
        print(idx+1, arr, ds, n);
        ds.remove(ds.indexOf(arr[idx]));
    
    }
}