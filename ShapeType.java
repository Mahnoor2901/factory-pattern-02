public enum ShapeType {

    CIRCLE(Circle.class),
    SQUARE(Square.class),
    RECTANGLE(Rectangle.class),
    TRIANGLE(Triangle.class);

    private final Class<? extends Shape> clazz;

    ShapeType(Class<? extends Shape> clazz) {
        this.clazz = clazz;
    }

    public Class<? extends Shape> getClazz() {
        return clazz;
    }

    // Helper method for String -> Enum conversion
    public static ShapeType fromString(String type) {
        try {
            return ShapeType.valueOf(type.trim().toUpperCase());
        } catch (Exception e) {
            return null;
        }
    }
}
