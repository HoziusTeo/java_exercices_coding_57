package ex7;

public class Car {
    public String brand;
    public String model;
    public int caiPutere;
    public char combustibil;

    public Car(String brand, String model, int caiPutere, char combustibil) {
        this.brand = brand;
        this.model = model;
        this.caiPutere = caiPutere;
        this.combustibil = combustibil;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", caiPutere=" + caiPutere +
                ", combustibil=" + combustibil +
                '}';
    }
}
