//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle  circle = new Circle();
        Rectangle1 rectangle = new Rectangle1();
        Square1 square = new Square1();

        circle.CalculateAreaCirc(4.4f);
        circle.CalculatePerimeterCirc(4.5f);

        rectangle.CalculateAreaRec(2f,3f);
        rectangle.CalculatePerimeterRec(2f,3f);

        square.CalculateAreaSquare(2f);
        square.CalculatePerimeterSquare(2f);

        String areC = circle.getOut("Площадь");
        String areP = circle.getOut("Периметр");

        String recC = rectangle.getOut("Площадь");
        String recP = rectangle.getOut("Периметр");

        String sqC = square.getOut("Площадь");
        String sqP = square.getOut("Периметр");

        System.out.println(areC);
        System.out.println(areP + "\n");
        System.out.println(recC);
        System.out.println(recP + "\n");
        System.out.println(sqC);
        System.out.println(sqP);




    }
}