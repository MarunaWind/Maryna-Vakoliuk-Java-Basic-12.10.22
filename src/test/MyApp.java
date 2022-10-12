package test;

public class MyApp {
    public static void main(String[] args) {
        double a = 15.6;
        double b = 38.3;
        double c = 12;

        double volume = a * b * c;
        double length = (a + b + c) * 4;

        System.out.println("Объем параллелепипеда = " + volume);
        System.out.println("Сума сторін = " + length);

    }
}
