public class Car {
    private String make;
    private String model;
    private int year;
    private float mileage;

    public Car(String make, String model, int year, float mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }
    public void displayDetails(){
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car Mileage: " + mileage);
    }
}
