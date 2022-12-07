package Test9;

import java.util.Random;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int i = random.nextInt((10) + 1) ;
        for (int j = 0; j < 5; j++) {
            int num = in.nextInt();
            if (num == i) {
                System.out.println("Вірно, загадане число = " + num);
                break;
            } else {
                System.out.println("Невірно");

            }
        }
    }

    }


