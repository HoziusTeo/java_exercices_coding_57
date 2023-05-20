package ex12;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // sa se simuleze jocul piatra foarfeca hartie si sa se stabileasca castigatorul
        // de modificat cod, adaugat 3 runde iar cine ia 2 din 3 castiga
        String[] options = {"piatra", "hartie", "foarfeca"};
        Random random = new Random();
        int player1Score = 0;
        int player2Score = 0;
        Scanner scanner = new Scanner(System.in);

        for (int runda = 1; runda <= 3; runda++) {
            System.out.println("Este runda " + runda + " va rugam sa introduceti numarul (0: piatra, 1: hartie, 2:foarfeca)");
            int player1;
            while (true) {
                if (scanner.hasNextInt()) {
                    player1 = scanner.nextInt();
                    if (player1 >= 0 && player1 <= 2) {
                        break;
                    }
                }
                System.out.println("Optiune invalida. Introduceti un numar valabil (0, 1 sau 2).");
                scanner.nextLine(); // Clear the input buffer
            }
 //           int player1;
            int player2 = random.nextInt(3);

            String playerText1 = options[player1];
            String playerText2 = options[player2];
            System.out.println("Scorul in runda aceasta este:" + player1Score + ":" + player2Score);
            System.out.println("Este runda " + runda);
            System.out.println("Player 1 are: " + playerText1);
            System.out.println("Player 2 are: " + playerText2);

            if (playerText1.equals(playerText2)) {
                System.out.println("avem egalitate");
                runda--;
            } else if (playerText1.equals("piatra") && playerText2.equals("foarfeca")) {
                System.out.println("player 1 wins");
                player1Score++;
            } else if (playerText1.equals("foarfeca") && playerText2.equals("hartie")) {
                System.out.println("player 1 wins");
                player1Score++;
            } else if (playerText1.equals("hartie") && playerText2.equals("piatra")) {
                System.out.println("player 1 wins ");
                player1Score++;
            } else {
                System.out.println("Player 2 castiga runda aceasta");
                player2Score++;
            }

            System.out.println();
        }

        System.out.println("Scor Final:" + player1Score + " : " + player2Score);
        System.out.println("Player 1 a castigat " + player1Score + " runde");
        System.out.println("Player 2 a castigat " + player2Score + " runde");

        if (player1Score > player2Score) {
            System.out.println("Player 1 castigat jocul");
        } else {
            System.out.println("Player 2 castigat jocul");
        }
    }
}