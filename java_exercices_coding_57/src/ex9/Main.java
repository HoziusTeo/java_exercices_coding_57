package ex9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        sa se citeasca de la tastatura 10 caractere si sa se adauge intr-un array.
         */

        Scanner scanner = new Scanner(System.in);
        String text[] = new String[10];
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Introduceti caracter:");
//
//            String caracter = scanner.next();
//            text[i] = caracter;
//        }
        String value = scanner.nextLine();
        text = value.split( "");
        for (String c:text){
            System.out.print(c + ", ");
        }
    }
}
