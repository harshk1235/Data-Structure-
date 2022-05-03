package Sorting;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,3,1,2};
        System.out.println(duplicatenumbers(arr));
    }
    static int duplicatenumbers(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                return arr[j];
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
