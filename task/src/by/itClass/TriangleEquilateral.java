package by.itClass;

public class TriangleEquilateral extends Figure {

    public TriangleEquilateral(String nameFigure, Point startLine, Point endLine) {
        super(nameFigure, startLine, endLine);
    }

    @Override
    public double square(Point startLine, Point endLine) {
        double x2 = Math.pow(endLine.getX() - startLine.getX(), 2);
        double y2 = Math.pow(endLine.getY() - startLine.getY(), 2);
        double side = Math.pow((x2 + y2), 0.5);
        double height = side;
        double radian = 30 * Math.PI / 180;
        return 0.5 * height * side * Math.cos(radian) ;
    }

    @Override
    public double perimeter(Point startLine, Point endLine) {
        double x2 = Math.pow(endLine.getX() - startLine.getX(), 2);
        double y2 = Math.pow(endLine.getY() - startLine.getY(), 2);
        double side = Math.pow((x2 + y2), 0.5);
        return side * 3;
    }


}
