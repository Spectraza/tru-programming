import java.util.Objects;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area(){
        return 2*super.area() + super.perimeter()*this.height;
    }

    @Override
    public double perimeter(){
        return 0;
    }

    @Override
    public double volume(){
        return super.area()*this.height;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cylinder cylinder)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(height, cylinder.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }

    @Override
    public String toString() {
        return "Cylinder{" + super.toString() +
                ", height=" + height +
                ", volume=" + volume() +
                ", area=" + area() +
                '}';
    }
}
