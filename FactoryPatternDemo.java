public class FactoryPatternDemo {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.create("CIRCLE", 2.0);
        Shape square = factory.create("SQUARE", 3.0);
        Shape rect   = factory.create("RECTANGLE", 4.0, 5.0);
        Shape tri    = factory.create("TRIANGLE", 3.0, 4.0, 5.0);

        print(circle);
        print(square);
        print(rect);
        print(tri);
    }

    private static void print(Shape shape) {

        if (shape != null) {
            shape.draw();
            System.out.println("Area = " + shape.area());
            System.out.println();
        } else {
            System.out.println("Shape not created.");
        }
    }
}
