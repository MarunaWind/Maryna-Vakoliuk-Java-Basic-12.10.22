package Test6;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MyApp {
    public static void main(String[] args) {
        String team1 = "Тигры";
        int frag1Team1 = 8;
        int frag2Team1 = 15;
        int frag3Team1 = 10;
        int frag4Team1 = 5;
        int frag5Team1 = 4;

        String team2 = "Слоны";
        int frag1Team2 = 7;
        int frag2Team2 = 4;
        int frag3Team2 = 13;
        int frag4Team2 = 19;
        int frag5Team2 = 4;

        double team1Average = (frag1Team1 + frag2Team1 + frag3Team1 + frag4Team1 + frag5Team1) / 5.0;
        double team2Average = (frag1Team2 + frag2Team2 + frag3Team2 + frag4Team2 + frag5Team2) / 5.0;

        if (team1Average > team2Average) {
            System.out.println("Победила команда " + team1 + " набравшая " + team1Average + " очков");
        } else {
            System.out.println("Победила команда " + team2 + " набравшая " + team2Average + " очков");
        }
    }
}
