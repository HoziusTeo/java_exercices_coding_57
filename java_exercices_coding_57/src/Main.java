import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // byte, short, int, long, double, char, boolean PRIMITIVE
        // i++ si ++1;

        int x = 10;
        if (x == 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        // Loops
        // for, foreach, -> bucla repetitiva cu numar cunoscut de pasi
        for ( int i = 0; i< 10; i++){
            System.out.println();
        }
        // dowhile(),while -> bucle repetitive cu numar necunost de pasi
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while( number != 0){
            System.out.println(number);
            scanner.nextInt();
        }
    }
}