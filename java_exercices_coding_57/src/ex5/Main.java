package ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        sa se introduce de la tastatura doua numere a si b.
        sa se calculeze suma, diferenta, produsul, impartirea celor doua numere.
        pentru fiecare operatie sa existe metode separate.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti a:");
        int a = scanner.nextInt();
        System.out.println("Introduceti b:");
        int b = scanner.nextInt();
        System.out.println(a);
        System.out.println(b);

        while(0<1){
            printMessage();
            int optiune = scanner.nextInt();
            if(optiune == 0){
                System.out.println("Multumim!");
                // break opreste bucla/loop si ne scoate din ea.
                break;
            }
            switch (optiune){
                case 1: sum(a,b);
                break;
                case 2: dif(a,b);
                break;
                case 3: prod(a,b);
                break;
                case 4: impartire(a,b);
                break;
                default:
                    System.out.println("optiune incorecta");
            }
        }

    }
    public static void sum (int a, int b){
        int sum = a + b;
        System.out.println("sum: "+ sum);

    }
     public static void dif(int a, int b){
         int dif = a - b;
         System.out.println("dif:"+ dif);
     }

     public static void prod( int a, int b){
         int prod = a * b;
         System.out.println("prod:"+ prod);

     }

     public static void impartire( int a, int b){
         int impartire = a / b;
         System.out.println("impartire:"+ impartire);
     }

     public static void printMessage(){
         System.out.println("selectati o optiune de mai jos:");
         System.out.println("1. adunare");
         System.out.println("2. scadere");
         System.out.println("3. inmultire");
         System.out.println("4. impartire");
         System.out.println("0. iesire");
     }
}
