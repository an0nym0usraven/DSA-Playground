import java.util.Arrays;


public class SelectionSort {
    static int maximum(int[] arr, int start, int end)
    {
        int max = start;

        for(int i=start; i<=end; i++)
        {
            if(arr[max]<arr[i])
            {
                max = i;
            }
        }
        return max;
    }
    static void selection(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            int last = arr.length-i-1;
            int max = maximum(arr,0,last);
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }
    }
     public static void main(String[] args) {
        int[] array = {3,4,2,1,9,-10};
        selection(array);
        System.out.println(Arrays.toString(array));
    }
}
