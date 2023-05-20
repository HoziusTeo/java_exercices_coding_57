package ex8;

public class Main {
    public static void main(String[] args) {
        /*
        sa se afiseze fiecare caracter dintr-un string.
         */
        String text = "Ana are mere.";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            System.out.println(c);
        }
    }
}
