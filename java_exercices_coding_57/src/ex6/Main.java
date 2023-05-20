package ex6;

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("Rex", 2);
        Dog pufi = new Dog("pufi", 10);
        Dog piki = new Dog("Piki", 5);
        System.out.println(rex);
        System.out.println(rex.getName());
        System.out.println(rex.getAge());

        Dog dogList[] = new Dog[3];
        dogList[0] = rex;
        dogList[1] = pufi;
        dogList[2] = piki;
        for (int i = 0; i < dogList.length; i++) {
            System.out.println(dogList[i].toString());

        }
        for (Dog dog : dogList) {
            System.out.println(dog);
        }
    }
}
