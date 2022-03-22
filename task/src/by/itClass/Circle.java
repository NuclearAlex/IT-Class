package by.itClass;

public class Circle extends Figure {

    public Circle(String nameFigure, Point startLine, Point endLine) {
        super(nameFigure, startLine, endLine);
    }

    @Override
    public double square(Point startLine, Point endLine) {
        double x2 = Math.pow(endLine.getX() - startLine.getX(), 2);
        double y2 = Math.pow(endLine.getY() - startLine.getY(), 2);
        double radius = Math.pow((x2 + y2), 0.5);
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter(Point startLine, Point endLine) {
        double x2 = Math.pow(endLine.getX() - startLine.getX(), 2);
        double y2 = Math.pow(endLine.getY() - startLine.getY(), 2);
        double radius = Math.pow((x2 + y2), 0.5);
        return 2 * radius * Math.PI;
    }
}
