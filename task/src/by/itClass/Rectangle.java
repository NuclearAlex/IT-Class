package by.itClass;

public class Rectangle extends Figure {

    public Rectangle(String nameFigure, Point startLine, Point endLine) {
        super(nameFigure, startLine, endLine);
    }

    @Override
    public double square() {
        double x = endLine.getX() - startLine.getX();
        double y = endLine.getY() - startLine.getY();
        return x * y;
    }

    @Override
    public double perimeter() {
        double x = endLine.getX() - startLine.getX();
        double y = endLine.getY() - startLine.getY();
        return x * 2 + y * 2;
    }


}
