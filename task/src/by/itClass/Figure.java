package by.itClass;

public abstract class Figure {

    String nameFigure;
    Point startLine;
    Point endLine;

    Figure(String nameFigure, Point startLine, Point endLine) {
        this.nameFigure = nameFigure;
        this.startLine = startLine;
        this.endLine = endLine;
    }

    public String getNameFigure() {
        return nameFigure;
    }

    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    public Point getStartLine() {
        return startLine;
    }

    public void setStartLine(Point startLine) {
        this.startLine = startLine;
    }

    public Point getEndLine() {
        return endLine;
    }

    public void setEndLine(Point endLine) {
        this.endLine = endLine;
    }

    public abstract double square(Point startLine, Point endLine);

    public abstract double perimeter(Point startLine, Point endLine);

}
