import static java.lang.Math.pow;

public class Square1 extends Figure {
    float Area, Perimeter;

    public Square1(float radius, float length, float width) {
        super(0, 2.3f, 0);
    }

    @Override
    public float CalculateAreaCirc(float radius) {
        return 0;
    }

    @Override
    public float CalculatePerimeterCirc(float radius) {
        return 0;
    }

    @Override
    public float CalculateAreaRec(float length, float width) {
        return 0;
    }

    @Override
    public float CalculatePerimeterRec(float length, float width) {
        return 0;
    }

    public Square1() {
        super(0, 2.3f, 0);
    }


    @Override
    public float CalculateAreaSquare(float lenght) {
        Area = (float) (pow(lenght, 2));

        return Area;
    }

    @Override
    public float CalculatePerimeterSquare(float length) {
        Perimeter = (float) (4 * length);

        return Perimeter;
    }

    public String getOut(String choose) {
        String info = null;
        if (choose.equals("Площадь")) {
            info = "Площадь квадрата = " + Area;
        }
        else if (choose.equals("Периметр")) {
            info = "Периметр квадрата = " + Perimeter;
        }

        return info;
    }
}
