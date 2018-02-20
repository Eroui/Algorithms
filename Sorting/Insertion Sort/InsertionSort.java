import java.util.*;
import java.io.*;

public class InsertionSort 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; ++i){
            arr[i] = in.nextInt();
        }

        insertionSort(arr);
        
        for(int el : arr) {
            System.out.print(el+ " ");
        } System.out.println();
    }

    /**
     * Sort the array given in the input (the array will change)
     * Complexity : O(n²)
     * @param arr the array to be sorted 
     */
    public static void insertionSort(int[] arr) 
    {
        for(int i = 1; i < arr.length; ++i){
            int el = arr[i];

            // Insert arr[i] into the sequence arr[0..i-1]
            int j = i - 1;
            while(j >= 0 && arr[j] > el){
                arr[j + 1] = arr[j--];
            }

            arr[j + 1] = el;
        }
    }
}