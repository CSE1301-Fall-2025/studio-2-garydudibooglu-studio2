package src.studio2;

import java.util.Scanner;

public class Ruin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the starting amount?");
        int startAmount = sc.nextInt();

        System.out.println("What is the win chance?");
        double winChance = sc.nextDouble();

        System.out.println("What is the win limit? ");
        int winLimit = sc.nextInt();

        System.out.println("How many days do you want to simulate");
        int totalSimulations = sc.nextInt();
        for (int simulations = 1; simulations <= totalSimulations; simulations++){
            int timesPlayed = 0;
            int sA = startAmount;
            while (sA < winLimit && sA > 0) {
                if (Math.random() >= 1 - winChance) {
                    sA++;
                } else {
                    sA--;
                }
                timesPlayed++;
            }
            System.out.println("Day: " + simulations);
            System.out.println("Times played " + timesPlayed);
            if (sA == winLimit) {
                System.out.println("Success!");
            } else {
                System.out.println("ruin!");
            }
        }
    }
}
