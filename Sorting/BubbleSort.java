import java.util.Arrays;

public class BubbleSort {

    static void bubble(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=1; j<arr.length-i; i++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {3,5,2,6,7,1};
        bubble(array);
        System.out.println(Arrays.toString(array));
    }
}
