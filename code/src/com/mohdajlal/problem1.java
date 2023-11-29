package com.mohdajlal;
import java.util.*;
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0)
        {
            int P = sc.nextInt();
            int n = sc.nextInt();
            int[] rank = new int[n];
            for (int i = 0; i < n; i++) {
                rank[i] = sc.nextInt();
            }

            System.out.println(paratha(rank, P)) ;
            t--;
        }
    }

    static boolean isvalid(int[] arr, int P, int mid) {
        int time = 0;
        int cp = 0;
        for (int i = 0; i < arr.length; i++) {
            time = arr[i];
            int j = 2;
            while (time <= mid) {
                cp++;
                time = time + (arr[i] * j);
                j++;
            }
            if (cp >= P)
                return true;
        }

        return false;
    }

    static int paratha(int[] arr, int paratha) {

        int ans = -1;
        int low = 0, high = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isvalid(arr, paratha, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
