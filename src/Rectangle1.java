public class Rectangle1 extends Figure{
    float length;
    float width;
    float Area, Perimeter;

    public Rectangle1(float radius, float length, float width){
        super(0,2.3f,3.2f);
    }

    public Rectangle1() {
        super(0,2.3f,3.2f);
    }


    @Override
    public float CalculateAreaRec(float length, float width) {
        Area = (float) (length * width);

        return Area;
    }

    @Override
    public float CalculatePerimeterRec(float length, float width) {
        Perimeter = (float) (2 * ( length + width));

        return Perimeter;
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
            info = "Площадь прямоугольника = " + Area;
        }
        else if (choose.equals("Периметр")) {
            info = "Периметр прямоугольника = " + Perimeter;
        }

        return info;
    }


}
