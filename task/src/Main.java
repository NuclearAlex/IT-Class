import by.itClass.*;

public class Main {

    public static void main(String[] args) {
        Figure circle = new Circle("Circle", new Point(0, 0), new Point(2, 2));
        double p1 = circle.perimeter(new Point(0, 0), new Point(2, 2));
        double s1 = circle.square(new Point(0, 0), new Point(2, 2));

        System.out.println("First figure: " + circle.getNameFigure());
        System.out.printf("Its points: x(%.0f, %.0f), y(%.0f, %.0f)\n", circle.getStartLine().getX(),
                circle.getStartLine().getY(), circle.getEndLine().getX(), circle.getEndLine().getY());
        System.out.printf("Square this %s = %.2f\n", circle.getNameFigure().toLowerCase(), s1);
        System.out.printf("Perimeter this %s = %.2f\n\n", circle.getNameFigure().toLowerCase(), p1);


        Figure rectangle = new Rectangle("Rectangle", new Point(0, 0), new Point(3, 3));
        double p2 = rectangle.perimeter(new Point(0, 0), new Point(3, 3));
        double s2 = rectangle.square(new Point(0, 0), new Point(3, 3));

        System.out.println("Second figure: " + rectangle.getNameFigure());
        System.out.printf("Its points: x(%.0f, %.0f), y(%.0f, %.0f)\n", rectangle.getStartLine().getX(),
                rectangle.getStartLine().getY(), rectangle.getEndLine().getX(), rectangle.getEndLine().getY());
        System.out.printf("Square this %s = %.2f\n", rectangle.getNameFigure().toLowerCase(), s2);
        System.out.printf("Perimeter this %s = %.2f\n\n", rectangle.getNameFigure().toLowerCase(), p2);


        Figure triangleEquilateral =
                new TriangleEquilateral("Equilateral triangle", new Point(0, 0), new Point(4, 4));
        double p3 = triangleEquilateral.perimeter(new Point(0, 0), new Point(4, 4));
        double s3 = triangleEquilateral.square(new Point(0, 0), new Point(4, 4));

        System.out.println("Third figure: " + triangleEquilateral.getNameFigure());
        System.out.printf("Its points: x(%.0f, %.0f), y(%.0f, %.0f)\n", triangleEquilateral.getStartLine().getX(),
                triangleEquilateral.getStartLine().getY(), triangleEquilateral.getEndLine().getX(),
                triangleEquilateral.getEndLine().getY());
        System.out.printf("Square this %s = %.2f\n", triangleEquilateral.getNameFigure().toLowerCase(), s3);
        System.out.printf("Perimeter this %s = %.2f\n\n", triangleEquilateral.getNameFigure().toLowerCase(), p3);

        Figure triangleRectangular =
                new TriangleRectangular("Rectangular triangle", new Point(0, 0), new Point(5, 5));
        double p4 = triangleRectangular.perimeter(new Point(0, 0), new Point(5, 5));
        double s4 = triangleRectangular.square(new Point(0, 0), new Point(5, 5));

        System.out.println("Fourth figure: " + triangleRectangular.getNameFigure());
        System.out.printf("Its points: x(%.0f, %.0f), y(%.0f, %.0f)\n", triangleRectangular.getStartLine().getX(),
                triangleRectangular.getStartLine().getY(), triangleRectangular.getEndLine().getX(),
                triangleRectangular.getEndLine().getY());
        System.out.printf("Square this %s = %.2f\n", triangleRectangular.getNameFigure().toLowerCase(), s4);
        System.out.printf("Perimeter this %s = %.2f\n\n", triangleRectangular.getNameFigure().toLowerCase(), p4);
    }
}
