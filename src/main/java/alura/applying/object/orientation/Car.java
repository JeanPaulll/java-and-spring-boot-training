package alura.applying.object.orientation;

public class Car {
    String model;
    int year;
    String color;

    void displaysTechnicalSheet() {
        System.out.println("Modelo: " + model);
        System.out.println("Ano: " + year);
        System.out.println("Cor: " + color);
    }

    int calculateAge() {
        return 2023 - year;
    }
}