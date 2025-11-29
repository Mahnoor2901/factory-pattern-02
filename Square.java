public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void draw() {
        System.out.println("Drawing Square (side = " + side + ")");
    }

    public double area() {
        return side * side;
    }
}
