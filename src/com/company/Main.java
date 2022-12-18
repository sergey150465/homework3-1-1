package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        if (calc.devide.apply(a, b) == 0) {
            System.out.println("Ошибка, деление на ноль!");
            return;
        }
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
    }
}
