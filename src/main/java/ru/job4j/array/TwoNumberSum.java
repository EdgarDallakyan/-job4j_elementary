package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] result = {};
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == target) {
                result = new int[]{i, j};
                break;
            } else if (array[i] + array[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = {1, 3, 5, 9, 0};
        int target = 3;
        int[] rsl = getIndexes(result, target);
        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i]);
        }
    }
}