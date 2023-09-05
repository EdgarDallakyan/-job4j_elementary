package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
       return ac + bc > ab && ab + bc > ac && ab + ac > bc;
    }

    public static void main(String[] args) {
        System.out.println(exist(6, 5, 12));
    }
}
