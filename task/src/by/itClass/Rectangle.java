package by.itClass;

public class Rectangle extends Figure {

    public Rectangle(String nameFigure, Point startLine, Point endLine) {
        super(nameFigure, startLine, endLine);
    }

    @Override
    public double square(Point startLine, Point endLine) {
        double x = endLine.getX() - startLine.getX();
        double y = endLine.getY() - startLine.getY();
        return x * y;
    }

    @Override
    public double perimeter(Point startLine, Point endLine) {
        double x = endLine.getX() - startLine.getX();
        double y = endLine.getY() - startLine.getY();
        return x * 2 + y * 2;
    }


}
