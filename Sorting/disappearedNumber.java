package Sorting;

import java.util.ArrayList;
import java.util.List;

//Find disappeared number from the array range from 1 to N.
public class disappearedNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,1,7,8,10,12,7,8};
        System.out.println(findnumbers(arr));
    }
    static List<Integer> findnumbers(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                ans.add(j+1);
            }

        }
        return ans;

    }
    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
