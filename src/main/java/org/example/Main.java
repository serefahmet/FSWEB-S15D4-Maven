package org.example;

import java.util.Stack;

public class Main {

    public static boolean checkForPalindrome(String input) {
        if (input == null || input.isEmpty()) return false;

        String cleaned = input.replaceAll("[^A-Za-z]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();
        for (char c : cleaned.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return cleaned.equals(reversed.toString());
    }

    public static String convertDecimalToBinary(int number) {
        if (number == 0) return "0";
        Stack<Integer> stack = new Stack<>();

        int n = number;
        while (n > 0) {
            stack.push(n % 2);
            n /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }
}
