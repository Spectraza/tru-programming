public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Corolla", 2022, 240f);
        Car car2 = new Car("Honda", "Civic", 2021, 220f);

        System.out.println("Car 1 Details: ");
        car1.displayDetails();

        System.out.println("Car 2 Details: ");
        car2.displayDetails();

        car1.setMake("Ford");
        car1.setModel("Mustang");
        car1.setYear(2020);
        car1.setMileage(140f);

        System.out.println("Updated Car 1 Details: ");
        car1.displayDetails();
    }
}