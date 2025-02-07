import java.util.Objects;

public class RightTriangle extends Shape {

    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return this.base * this.height / 2;
    }

    @Override
    public double perimeter() {
        return this.base + this.height + Math.sqrt(this.base * this.base + this.height * this.height);
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "base=" + base +
                ", height=" + height +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof RightTriangle that)) return false;
        return Double.compare(base, that.base) == 0 && Double.compare(height, that.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, height);
    }
}
