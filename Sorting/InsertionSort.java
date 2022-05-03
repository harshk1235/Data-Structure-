package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

//    static void insertion(int[] arr){
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i+1; j > 0; j--) {
//                if(arr[j]<arr[j-1]){
//                    swap(arr,j,j-1);
//                }
//                else{
//                    break;
//                }
//            }
//        }
////    }
//    static void swap(int[] arr,int first,int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
    public static void InsertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while(j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;

        }
    }

}
