package ex7;

public class Main {
    public static void main(String[] args) {
        /*
        sa se construiasca clasa cu numele Car, cu proprietatile: brand, model, cai putere si combustibil.
        sa se introduca 3 obiecte de tipul Car, unul pe benzina si 2 pe motorina
        sa se afiseze doar masinile pe benzina, dupa parcurgerea unui for.
         */
        Car bmw= new Car("BMW","I8",250,'B');
        Car mercedes = new Car("Mercedes","SUV",300,'D');
        Car skoda = new Car("Skoda","Octavia",165,'D');

        Car carList[]= new Car[3];
        carList[0] = bmw;
        carList[1] = mercedes;
        carList[2] = skoda;
        for (int i = 0; i < carList.length; i++) {
            if( carList[i].combustibil == 'B'){

                System.out.println(carList[i]);
            }
        }
    }
}
