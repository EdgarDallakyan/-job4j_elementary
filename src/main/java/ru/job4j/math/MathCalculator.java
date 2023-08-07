package ru.job4j.math;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double minAndDivision(double first, double second) {
        return minus(first, second) + division(first, second);
    }

    public static double total(double first, double second) {
        return sumAndMultiply(first, second) + minAndDivision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + minAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + total(10, 20));
    }
}