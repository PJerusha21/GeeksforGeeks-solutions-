import java.util.*;

class Solution {

    int missingNum(int arr[]) {

        int n = arr.length + 1;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        return expectedSum - actualSum;
    }
}

public class Day1_2 {

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 5};   

        Solution obj = new Solution();

        int result = obj.missingNum(arr);

        System.out.println("Missing Number: " + result);
    }
}