package by.itClass;

public class TriangleRectangular extends Figure {

    public TriangleRectangular(String nameFigure, Point startLine, Point endLine) {
        super(nameFigure, startLine, endLine);
    }

    @Override
    public double square(Point startLine, Point endLine) {
        double x2 = Math.pow(endLine.getX() - startLine.getX(), 2);
        double y2 = Math.pow(endLine.getY() - startLine.getY(), 2);
        double side = Math.pow((x2 + y2), 0.5);
        double height = endLine.getY() - startLine.getY();
        return 0.5 * height * side;
    }

    @Override
    public double perimeter(Point startLine, Point endLine) {
        double x = endLine.getX() - startLine.getX();
        double y = endLine.getY() - startLine.getY();
        double x2 = Math.pow(endLine.getX() - startLine.getX(), 2);
        double y2 = Math.pow(endLine.getY() - startLine.getY(), 2);
        double side = Math.pow((x2 + y2), 0.5);
        return side + x + y;
    }


}
