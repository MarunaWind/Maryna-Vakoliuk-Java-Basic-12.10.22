package test5;

public class MyApp {
    public static void main(String[] args) {
        int liCount = 860;
        int minCount = (int) (liCount * 1.5);

        int liPower = liCount * (13 + 24 + 46);
        int minPower = minCount * (9 + 35 + 12);

        System.out.println("Ли загальна атака = " + liPower);
        System.out.println("Минь загальна атака = " + minPower);
    }
}
