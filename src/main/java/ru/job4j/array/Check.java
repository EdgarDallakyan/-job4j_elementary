package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mono(new boolean[]{true, true, true, true}));
    }
}
