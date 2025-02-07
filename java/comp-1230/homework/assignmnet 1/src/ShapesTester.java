/*
* Name: Valeriia Savych
* Student ID: T00739110
* Course Number: COMP 1230
* Assignment Number: 1
* Description: I practiced with
* inheritance by creating different
* shapes related to each other, and wrote
* various methods for them. After that, I
* tested them all in main.
* */


public class ShapesTester {
    public static void main(String[] args) {

        System.out.println("== Testing Rectangle ==");
        System.out.println("Creating Rectangle with length=20, width=30...");
        Rectangle rectangle = new Rectangle(20, 30);

        System.out.println("Testing toString() for Rectangle: " + rectangle);
        System.out.println("Testing getLength(): " + rectangle.getLength());
        System.out.println("Testing getWidth(): " + rectangle.getWidth());
        System.out.println("Testing area(): " + rectangle.area());
        System.out.println("Testing perimeter(): " + rectangle.perimeter());
        System.out.println("Testing volume(): " + rectangle.volume());
        System.out.println("Testing isSquare(): " + rectangle.isSquare());
        System.out.println("Testing hashCode(): " + rectangle.hashCode());
        System.out.println("Testing equals() with new Rectangle(30,20): "
                + rectangle.equals(new Rectangle(30, 20)));

        System.out.println("Setting length to 10 and width to 10...");
        rectangle.setLength(10);
        rectangle.setWidth(10);
        System.out.println("Now isSquare(): " + rectangle.isSquare());
        System.out.println();

        System.out.println("== Testing RightTriangle ==");
        System.out.println("Creating RightTriangle with base=3, height=4...");
        RightTriangle rightTriangle = new RightTriangle(3, 4);

        System.out.println("Testing toString(): " + rightTriangle);
        System.out.println("Testing getBase(): " + rightTriangle.getBase());
        System.out.println("Testing getHeight(): " + rightTriangle.getHeight());
        System.out.println("Testing area(): " + rightTriangle.area());
        System.out.println("Testing perimeter(): " + rightTriangle.perimeter());
        System.out.println("Testing volume(): " + rightTriangle.volume());
        System.out.println("Testing hashCode(): " + rightTriangle.hashCode());
        System.out.println("Testing equals() with new RightTriangle(3,4): "
                + rightTriangle.equals(new RightTriangle(3, 4)));

        System.out.println("Setting base to 5 and height to 12...");
        rightTriangle.setBase(5);
        rightTriangle.setHeight(12);
        System.out.println("New area(): " + rightTriangle.area());
        System.out.println("New perimeter(): " + rightTriangle.perimeter());
        System.out.println();

        System.out.println("== Testing Circle ==");
        System.out.println("Creating Circle with radius=5...");
        Circle circle = new Circle(5);

        System.out.println("Testing toString(): " + circle);
        System.out.println("Testing getRadius(): " + circle.getRadius());
        System.out.println("Testing area(): " + circle.area());
        System.out.println("Testing perimeter(): " + circle.perimeter());
        System.out.println("Testing volume(): " + circle.volume());
        System.out.println("Testing hashCode(): " + circle.hashCode());
        System.out.println("Testing equals() with Circle(5): "
                + circle.equals(new Circle(5)));

        System.out.println("Setting radius to 10...");
        circle.setRadius(10);
        System.out.println("New radius: " + circle.getRadius());
        System.out.println("New area(): " + circle.area());
        System.out.println();

        System.out.println("== Testing Cylinder ==");
        System.out.println("Creating Cylinder with radius=3, height=10...");
        Cylinder cylinder = new Cylinder(3, 10);

        System.out.println("Testing toString(): " + cylinder);
        System.out.println("Testing getRadius(): " + cylinder.getRadius());
        System.out.println("Testing getHeight(): " + cylinder.getHeight());
        System.out.println("Testing area(): " + cylinder.area());

        /*In toString I was calling super.toString, but somehow because I did override on the perimeter,
        the toString from super is calling the perimeter from child,
        and because for 3d shapes it is set to 0 it is giving 0 in the parent,
        I did not know what to do with this, so I just left it like this because I liked the look of toString code
        and I did not want to rewrite for super every time.*/

        System.out.println("Testing perimeter(): " + cylinder.perimeter());
        System.out.println("Testing volume(): " + cylinder.volume());
        System.out.println("Testing hashCode(): " + cylinder.hashCode());
        System.out.println("Testing equals() with Cylinder(3,10): "
                + cylinder.equals(new Cylinder(3, 10)));

        System.out.println("Setting radius to 5 and height to 20...");
        cylinder.setRadius(5);
        cylinder.setHeight(20);
        System.out.println("New radius: " + cylinder.getRadius());
        System.out.println("New height: " + cylinder.getHeight());
        System.out.println("New area(): " + cylinder.area());
        System.out.println("New volume(): " + cylinder.volume());
        System.out.println();

        System.out.println("== Testing Sphere ==");
        System.out.println("Creating Sphere with radius=4...");
        Sphere sphere = new Sphere(4);

        System.out.println("Testing toString(): " + sphere);
        System.out.println("Testing getRadius(): " + sphere.getRadius());
        System.out.println("Testing area(): " + sphere.area());
        System.out.println("Testing perimeter(): " + sphere.perimeter());
        System.out.println("Testing volume(): " + sphere.volume());
        System.out.println("Testing hashCode(): " + sphere.hashCode());
        System.out.println("Testing equals() with Sphere(4): "
                + sphere.equals(new Sphere(4)));

        System.out.println("Setting radius to 8...");
        sphere.setRadius(8);
        System.out.println("New radius: " + sphere.getRadius());
        System.out.println("New area(): " + sphere.area());
        System.out.println("New volume(): " + sphere.volume());
        System.out.println();

        System.out.println("== Testing RectangularPrism ==");
        System.out.println("Creating RectangularPrism with length=2, width=3, height=4...");
        RectangularPrism rectangularPrism = new RectangularPrism(2, 3, 4);

        System.out.println("Testing toString(): " + rectangularPrism);
        System.out.println("Testing getLength(): " + rectangularPrism.getLength());
        System.out.println("Testing getWidth(): " + rectangularPrism.getWidth());
        System.out.println("Testing getHeight(): " + rectangularPrism.getHeight());
        System.out.println("Testing area(): " + rectangularPrism.area());
        System.out.println("Testing perimeter(): " + rectangularPrism.perimeter());
        System.out.println("Testing volume(): " + rectangularPrism.volume());
        System.out.println("Testing hashCode(): " + rectangularPrism.hashCode());
        System.out.println("Testing equals() with RectangularPrism(4,3,2): "
                + rectangularPrism.equals(new RectangularPrism(4, 3, 2)));

        System.out.println("Setting length=5, width=6, height=7...");
        rectangularPrism.setLength(5);
        rectangularPrism.setWidth(6);
        rectangularPrism.setHeight(7);
        System.out.println("New area(): " + rectangularPrism.area());
        System.out.println("New volume(): " + rectangularPrism.volume());
        System.out.println();
    }
}

