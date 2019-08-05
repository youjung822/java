package coding.interview.array;

import java.util.Arrays;

public class FindKthSmallestElement {
    /* https://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/
     * Given an array and a number k where k is smaller than size of array,
     * we need to find the k’th smallest element in the given array. It is given
     * that ll array elements are distinct.
     *
     *  Input: arr[] = {7, 10, 4, 3, 20, 15}
        k = 3
        Output: 7

        Input: arr[] = {7, 10, 4, 3, 20, 15}
        k = 4
        Output: 10
     */

    public static void main(String[] args){
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        findKthSmallestElem(arr, k);
    }
    private static void findKthSmallestElem(int[] arr, int k){
        //sort the array till the kth smallest elements
        int len = arr.length;
        /**
         * Sorts the specified array into ascending numerical order.
         *
         * <p>Implementation note: The sorting algorithm is a Dual-Pivot Quicksort
         * by Vladimir Yaroslavskiy, Jon Bentley, and Joshua Bloch. This algorithm
         * offers O(n log(n)) performance on many data sets that cause other
         * quicksorts to degrade to quadratic performance, and is typically
         * faster than traditional (one-pivot) Quicksort implementations.
         *
         * @param a the array to be sorted
         */
        Arrays.sort(arr);

        System.out.println(arr[k-1]);


    }

}
