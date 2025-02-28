/**
 * The RectangularPrism class extends the Rectangle class to add a third dimension (height).
 * It overrides and augments some methods to account for 3D properties like volume.
 */
public class RectangularPrism extends Rectangle {

    /**
     * An additional dimension specific to the prism.
     */
    private double height;

    /**
     * Constructor initializes the inherited width and length using super
     * (calling the parent class's constructor), and also sets the new height.
     */
    public RectangularPrism(double width, double length, double height) {
        super(width, length);  // super() calls the Rectangle constructor
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * This overrides the area() method from Rectangle to calculate
     * the total surface area of a rectangular prism (6 faces).
     *
     * The @Override annotation indicates that we are replacing the
     * parent class's implementation with a new one tailored for 3D.
     */
    @Override
    public double area() {
        // super.area() is the area of the Rectangle base (width * length).
        // We add the areas of the sides: length*height + width*height (and multiply by 2 for both sides).
        return 2 * (super.area() + super.getLength() * this.height + super.getWidth() * this.height);
    }

    /**
     * Calculates the volume of the rectangular prism by multiplying the area of the base
     * (width * length) by the height. This is new to the 3D class.
     */
    public double volume() {
        return super.area() * this.height;
    }

    /**
     * Overriding equals() to define equality between two RectangularPrism objects.
     *
     * 1. instanceof checks whether o is actually a RectangularPrism.
     * 2. If the parent part (Rectangle) is not equal, we immediately return false.
     * 3. Finally, we check if both objects have the same height.
     *
     * IntelliJ IDEA auto-generated this method, but I am aware of how it works and how instanceof works
     * to ensure that the object is of the correct type before comparing fields.
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof RectangularPrism that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(height, that.height) == 0;
    }

    /**
     * Whenever you override equals(), you should also override hashCode()
     * to maintain consistency (so that two equal objects produce the same hash code).
     *
     * Again, this was auto-generated by IntelliJ IDEA, but I understand that it
     * includes the parents hashCode plus our height field.
     */
    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), height);
    }

    /**
     * Overrides the parent toString() for debug-friendly output.
     * We prepend "RectangularPrism" and add 3D details: height and volume.
     *
     * super.toString() calls Rectangles toString(), giving us width, length, etc.
     */
    @Override
    public String toString() {
        return "RectangularPrism{ " + super.toString() +
                ", height=" + height +
                ", volume=" + volume() +
                ", area=" + area() +
                '}';
    }

    /**
     * Since perimeter is not directly meaningful for a 3D solid,
     * we override this to return 0 or another suitable default.
     */
    @Override
    public double perimeter() {
        return 0;
    }
}
