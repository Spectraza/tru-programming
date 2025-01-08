public class Car {
    String make;
    String model;
    int year;
    String color;

    public Car(String make, String model, int year, String color) {

        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    void display() {
        System.out.println(year + " " + make + " " + model + " " + color);
    }
}




