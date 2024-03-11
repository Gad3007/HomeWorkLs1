public abstract class Figure {
    private float radius;
    private float length;
    private float width;

    public Figure(float radius, float length, float width) {
        this.radius = radius;
        this.length = length;
        this.width = width;
    }

    public float CalculateArea(float radius, float length, float width) {
        float area = length * width;

        return area;
    }

    public float CalculatePerimeter(float radius, float length, float width) {
        float perimeter = 2 * (length + width);

        return perimeter;
    }


    public abstract float CalculateAreaRec(float length, float width);

    public abstract float CalculatePerimeterRec(float length, float width);

    public abstract float CalculateAreaCirc(float radius);

    public abstract float CalculatePerimeterCirc(float radius);

    public abstract float CalculateAreaSquare(float lenght);

    public abstract float CalculatePerimeterSquare(float length);
}