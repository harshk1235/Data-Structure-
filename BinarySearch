package BinarySearch;

import java.util.Scanner;

public class BinarySearch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,5,9,12,14,16,18};

        int res =ceiling(arr,18);
        System.out.println(res);

    }

    static int ceiling(int[] arr,int target){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end){
            mid = start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]==target){
                ans=arr[mid];
//                System.out.println(ans);
                return ans;
            }
//            else if(arr[mid]!=target && arr[mid]>target){
//                ans=arr[mid];
//                System.out.println(arr[mid]);
//                return ans;
//            }
        }
//        System.out.println(ans);

        return arr[start];
    }
}
