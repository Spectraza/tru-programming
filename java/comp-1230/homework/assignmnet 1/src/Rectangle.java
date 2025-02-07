import java.util.Objects;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return this.length * this.width;
    }

    @Override
    public double perimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public double volume() {
        return 0;
    }

    public boolean isSquare() {
        return this.length == this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{ " +
                "width=" + this.width +
                ", length=" + this.length +
                ", area=" + this.area() +
                ", perimeter=" + this.perimeter() +
                ", isSquare=" + this.isSquare() +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length);
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }

        if (anObject instanceof Rectangle rectangle) {
            return rectangle.length == this.length && rectangle.width == this.width;
        } else {
            return false;
        }
    }
}
