package com.mohdajlal;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int c = sc.nextInt();
        int [] arr = new int[c];
        for (int i = 0; i < c; i++) {
            arr[i] = sc.nextInt();
        }
        int low =0;
        int high = 1000;
        int ans =0;
        while(low <= high){
            int mid = low + (high- low)/2;
            if(isvalid(arr,p,mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }
        System.out.println(ans);
    }
    public static boolean isvalid(int[] arr , int p , int mid){
        int time =0;
        int parantha = 0;
        for (int i = 0; i < arr.length; i++) {
            time = arr[i];
            int mul =2;
            while(time <= mid){
                parantha++;
                time = time + (arr[i]*mul);
                mul++;
            }
            if(parantha>=p)
                return true;
        }
        return false;
    }

}