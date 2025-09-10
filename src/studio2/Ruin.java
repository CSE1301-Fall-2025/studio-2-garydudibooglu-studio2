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
        int simulations = 0;
        while (simulations < totalSimulations) {
            simulations++;
            while (startAmount < winLimit && startAmount > 0) {
                if (Math.random() >= 1 - winChance) {
                    startAmount++;
                } else {
                    startAmount--;
                }
            }
            System.out.println("Day: " + simulations);
            if (startAmount == winLimit) {
                System.out.println("Success!");
            } else {
                System.out.println("ruin!");
            }
        }
    }
}
