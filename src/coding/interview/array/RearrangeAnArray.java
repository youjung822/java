package coding.interview.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RearrangeAnArray {
    /* https://www.geeksforgeeks.org/rearrange-array-arri/
    * Given an array of elements of length N, ranging from 0 to N – 1.
    * All elements may not be present in the array. If element is not
    * present then there will be -1 present in the array. Rearrange the
    * array such that A[i] = i and if i is not present, display -1 at
    * that place.
    *
    * Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
    *      Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
    *                -1  1  2  3  4   0  6  -1  0  -1
    *                0   1  2  3  4  -1  6 -1  -1  9
    * */

    public static void main(String[] args){
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        for(int i = 0; i<arr.length;){
            if(arr[i]>=0 &&arr[i]!=i){
                int ele = arr[arr[i]];
                arr[arr[i]] =arr[i];
                arr[i] =ele;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    /* YJ's answer
    public static void main(String[] args){
        int[] arr =  {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int[] arrArrg = new int[arr.length];

        // if index value is in the array..
        for(int i=0;i<arrArrg.length; i++){
            //Allocate valid(indexable >0, less than lenght) value to its index
            if(arr[i] >= 0  &&  arr[i] < arr.length){
                arrArrg[arr[i]] = arr[i];
            }
        }
        for(int j = 0; j<arrArrg.length; j++){
            if(arrArrg[j] != j){
                arrArrg[j] = -1;
            }
        }

        System.out.println("ArragnedArr: ");
        for(int k:arrArrg){
            System.out.print(" "+ k);
        }


    }
    */
}
