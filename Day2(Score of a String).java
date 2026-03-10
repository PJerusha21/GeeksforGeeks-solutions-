public class Solution {

    public static int scoreOfString(String s) {
        int score = 0;

        for (int i = 1; i < s.length(); i++) {
            int diff = Math.abs(s.charAt(i) - s.charAt(i - 1));
            score += diff;
        }

        return score;
    }

    public static void main(String[] args) {

        String s1 = "code";
        String s2 = "neetcode";

        System.out.println(scoreOfString(s1));
        System.out.println(scoreOfString(s2));
    }
}