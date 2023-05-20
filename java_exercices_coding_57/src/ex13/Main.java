package ex13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word = "fundamentals";
        String[] player = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            if (i == 0 || i == word.length() - 1) {
                System.out.print(word.charAt(i));
                player[i] = word.charAt(i) + "";
            } else {
                player[i] = "_";
                System.out.print("_");
            }
            System.out.print(" ");
        }
        Scanner scanner = new Scanner(System.in);

        do {
            String userinput = scanner.next();
            if (word.contains(userinput)) {
                for(int i = 0;i < word.length();i++){
                    char c = word.charAt(i);
                    if (c == userinput.charAt(0)){
                        System.out.println(userinput.charAt(0));
                        player[i] = userinput;
                    }
                }
                showArray(player);
            } else {
                System.out.println("Mai incearca");
            }
        } while (true);
    }

    public static void showArray(String[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
