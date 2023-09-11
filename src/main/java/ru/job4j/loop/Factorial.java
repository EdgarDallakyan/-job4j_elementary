package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int a = 2; a <= n; a++) {
            result = result * a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(5));
    }
}
