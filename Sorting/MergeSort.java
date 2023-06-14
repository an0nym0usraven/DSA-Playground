import java.util.Scanner;
import java.util.Arrays;

public class MergeSort {

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] res = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                res[k] = first[i];
                i++;
            } else {
                res[k] = second[j];
                j++;
            }
            k++;
        }

        while(i<first.length)
        {
            res[k] = first[i];
            i++;
            k++;
        }

        while(j<second.length)
        {
            res[k] = second[j];
            j++;
            k++;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = { 23, 45, 1, 0, -2, 24 };

    
        System.out.println(Arrays.toString(mergeSort(array)));
    }
}
