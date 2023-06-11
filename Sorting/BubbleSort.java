import java.util.Arrays;

public class BubbleSort {

    static void bubble(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            boolean swapped = false;
            for(int j=1; j<arr.length-i; j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            if(!swapped)
            {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {-45,23,0,26,9,-10};
        bubble(array);
        System.out.println(Arrays.toString(array));
    }
}
