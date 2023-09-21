package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        for (int i = 0; i < left.length - 1; i++) {
            if (left[left.length - 1] != right[right.length - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(check(new int[]{1, 2, 3, 4, 5}, new int[] {1, 2, 3, 4, 9}));
    }
}
