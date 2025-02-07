public class Sphere extends Circle {
    public Sphere(double radius) {
        super(radius);
    }


    @Override
    public double area() {
        return 4 * super.area();
    }

    @Override
    public double volume() {
        return this.area() / 3 * super.getRadius();
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Sphere{" + super.toString() +
                ", volume=" + volume() +
                ", area=" + area() +
                '}';
    }
}
