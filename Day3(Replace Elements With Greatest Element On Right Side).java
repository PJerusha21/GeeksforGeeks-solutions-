import java.util.Arrays;

public class Solution {

    public static int[] replaceElements(int[] arr) {

        int maxRight = -1;

        for (int i = arr.length - 1; i >= 0; i--) {

            int current = arr[i];
            arr[i] = maxRight;

            if (current > maxRight) {
                maxRight = current;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {2,4,5,3,1,2};

        int[] result = replaceElements(arr);

        System.out.println(Arrays.toString(result));
    }
}