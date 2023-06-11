package Recursion;
import java.util.Arrays;

public class ReverseArray {
    static void reverse(int[] arr,int start, int end)
    {
        if(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverse(arr, start+1, end-1);
        }
    }
    public static void main(String[] args)
    {
        int[] array = {3,5,2,6,7,1};
        reverse(array, 0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
