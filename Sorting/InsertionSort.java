import java.util.Arrays;

public class InsertionSort {
    static void insertion(int[] arr)
    {
        boolean swapped = false;
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j>0; j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
                if(!swapped)
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {-45,23,0,26,9,-10};
        insertion(array);
        System.out.println(Arrays.toString(array));
    }
}
