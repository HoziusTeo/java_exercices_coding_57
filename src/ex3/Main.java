package ex3;

public class                                                                                                                       Main {
    public static void main(String[] args) {
        /*
        sa se gaseasca primele 15 numere divizibile cu nr 5;
         */
        int i = 1;
        int contor = 0;
        while (contor <= 15){
            if(i % 5 == 0){
                contor ++;
                System.out.println(i);
            }
            i++;
        }
    }
}
