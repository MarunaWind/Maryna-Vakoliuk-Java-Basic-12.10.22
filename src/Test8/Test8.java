package Test8;

import java.sql.SQLOutput;
import java.util.Random;

public class Test8 {
    public static void main(String[] args) {
        int team1[] = new int[25];
        int team2[] = new int[25];
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            team1[i] = random.nextInt((45 - 18) + 1) + 18;
            team2[i] = random.nextInt((45 - 18) + 1) + 18;
        }
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < 25; i++) {
            System.out.print(team1[i] + " ");
            n1 = (n1 + team1[i]);
        }

        System.out.println();

        for (int i = 0; i < 25; i++) {
            System.out.print(team2[i] + " ");
            n2 = (n2 + team2[i]);
        }
        System.out.println();
        System.out.println("Середній вік 1 команди " + n1 / 25);
        System.out.println("Середній вік 2 команди " + n2 / 25);


    }


}

