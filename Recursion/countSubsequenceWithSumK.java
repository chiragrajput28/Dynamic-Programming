package Recursion;

public class countSubsequenceWithSumK {
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,2};
        int k = 4;
        int sum = 0;
        int n = arr.length;
        System.out.println(print(0, arr, k, n, sum));

    }
    public static int print(int idx, int arr[], int k, int n, int sum) {
        if(idx == n) {
            if(sum == k) {
                return 1;
            }
            return 0 ; 
        }
        sum += arr[idx];
        int l = print(idx + 1, arr, k, n, sum);
        sum -= arr[idx];
        int r = print(idx + 1, arr, k, n, sum);
        return l+r;
    }
}
