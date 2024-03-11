import static java.lang.Math.*;

public class Circle extends Figure {
    float Area, Perimeter;

    public Circle(float radius, float length, float width) {
        super(2.4f, 0, 0);
    }

    @Override
    public float CalculateAreaRec(float length, float width) {
        return 0;
    }

    @Override
    public float CalculatePerimeterRec(float length, float width) {
        return 0;
    }

    public Circle() {
        super(4.5f, 0,0);
    }

    @Override
    public float CalculateAreaCirc(float radius) {
        Area = (float) (PI * pow(radius, 2));

        return Area;
    }

    @Override
    public float CalculatePerimeterCirc(float radius) {
        Perimeter = (float) (2 * PI * radius);

        return Perimeter;
    }

    @Override
    public float CalculateAreaSquare(float lenght) {
        return 0;
    }

    @Override
    public float CalculatePerimeterSquare(float length) {
        return 0;
    }

    public String getOut(String choose) {
        String info = null;
        if (choose.equals("Площадь")) {
            info = "Площадь круга = " + Area;
        }
        else if (choose.equals("Периметр")) {
            info = "Периметр круга = " + Perimeter;
        }

        return info;
    }
}