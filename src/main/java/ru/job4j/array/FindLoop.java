package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        System.out.println(indexOf(new int[]{5, 10, 3}, 5));
        System.out.println(indexInRange(new int[]{19, 15, 25, 42, 69}, 69, 0, 4));
    }
}

