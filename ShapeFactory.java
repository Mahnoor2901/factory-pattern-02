import java.lang.reflect.Constructor;

public class ShapeFactory {

    public Shape create(String shapeType, double... params) {

        try {

            ShapeType shapeType1 = ShapeType.fromString(shapeType); // ✅ FIXED

            if (shapeType1 == null)
                return null;

            Class<? extends Shape> clazz = shapeType1.getClazz();
            Constructor<?>[] cons = clazz.getDeclaredConstructors();

            for (Constructor<?> c : cons) {

                if (c.getParameterCount() == params.length) {

                    return (Shape) c.newInstance(
                        convertDoublesToObjects(params)
                    );
                }
            }

            throw new IllegalArgumentException("Wrong parameters");

        } catch (Exception e) {
            return null;
        }
    }

    private Object[] convertDoublesToObjects(double[] params) {

        Object[] objs = new Object[params.length];
        for (int i = 0; i < params.length; i++) {
            objs[i] = params[i];
        }
        return objs;
    }
}
