package com.dsa;

public class LongestPalindromicSubstring {
    private int start = 0;
    private int maxLength = 0;

    public static void main(String[] args) {
        LongestPalindromicSubstring solver = new LongestPalindromicSubstring();
        System.out.println(solver.longestPalindrome("babad"));   // Output: "bab" or "aba"
        System.out.println(solver.longestPalindrome("cbbd"));    // Output: "bb"
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) return s;

        for (int i = 0; i < n - 1; i++) {
            expandAroundCenter(s, i, i); // Odd-length palindromes
            expandAroundCenter(s, i, i + 1); // Even-length palindromes
        }
        return s.substring(start, start + maxLength);
    }

    private void expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        int currentLength = right - left - 1;
        if (currentLength > maxLength) {
            maxLength = currentLength;
            start = left + 1;
        }
    }
}