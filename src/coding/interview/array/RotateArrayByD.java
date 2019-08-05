package coding.interview.array;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArrayByD {
    /* https://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/
    * Write a function rotate(arr[], d, n) that rotates arr[] of size n by d elements.
    * Input :  arr[] = [1, 2, 3, 4, 5, 6, 7]
    *        d = 2
    * Output : arr[] = [3, 4, 5, 6, 7, 1, 2]
    */

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        //int[] shifted = {3, 4, 5, 6, 7, 1, 2};
        int d =2;
        //rotate(arr,2,arr.length);//Time complexity - O(n), Auxiliary O(n)
        leftRotate(arr,2,arr.length);//Time complexity - O(n), Auxiliary O(1)
    }

    private static void leftRotate(int[] arr, int d, int n){
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr, int start, int end){
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    private static void rotate(int[] arr, int d, int n){

        int[] shifted = new int[arr.length];
        for(int i=n-1; i>=0; i--){
            if(i-d >= 0){
                shifted[i-d] = arr[i];
            }else{
              shifted[n-1-i] =arr[i];
            }
        }
        System.out.println(Arrays.toString(shifted));
    }
}
