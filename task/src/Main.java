import by.itClass.*;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle("Circle", new Point(0, 0), new Point(2, 2));
        double p1 = circle.perimeter(new Point(0, 0), new Point(2, 2));
        double s1 = circle.square(new Point(0, 0), new Point(2, 2));

        System.out.printf("Square this %s = %.2f\n", circle.getNameFigure(), s1);
        System.out.printf("Perimeter this %s = %.2f\n\n", circle.getNameFigure(), p1);


        Rectangle rectangle = new Rectangle("Rectangle", new Point(0, 0), new Point(2, 2));
        double p2 = rectangle.perimeter(new Point(0, 0), new Point(2, 2));
        double s2 = rectangle.square(new Point(0, 0), new Point(2, 2));

        System.out.printf("Square this %s = %.2f\n", rectangle.getNameFigure(), s2);
        System.out.printf("Perimeter this %s = %.2f\n\n", rectangle.getNameFigure(), p2);


        TriangleEquilateral triangleEquilateral =
                new TriangleEquilateral("Equilateral triangle", new Point(0, 0), new Point(2, 2));
        double p3 = triangleEquilateral.perimeter(new Point(0, 0), new Point(2, 2));
        double s3 = triangleEquilateral.square(new Point(0, 0), new Point(2, 2));

        System.out.printf("Square this %s = %.2f\n", triangleEquilateral.getNameFigure(), s3);
        System.out.printf("Perimeter this %s = %.2f\n\n", triangleEquilateral.getNameFigure(), p3);

        TriangleRectangular triangleRectangular =
                new TriangleRectangular("Rectangular triangle", new Point(0, 0), new Point(2, 2));
        double p4 = triangleRectangular.perimeter(new Point(0, 0), new Point(2, 2));
        double s4 = triangleRectangular.square(new Point(0, 0), new Point(2, 2));

        System.out.printf("Square this %s = %.2f\n", triangleRectangular.getNameFigure(), s4);
        System.out.printf("Perimeter this %s = %.2f\n\n", triangleRectangular.getNameFigure(), p4);
    }
}
