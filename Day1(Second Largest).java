import java.util.*;

class Day1_3 {

    static int getSecondLargest(int[] arr) {

        int largest = -1;
        int secondLargest = -1;

        for (int num : arr) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }

            else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 1};

        System.out.println(getSecondLargest(arr));
    }
}