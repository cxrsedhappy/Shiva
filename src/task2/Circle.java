package task2;

public class Circle {
    private Point center;
    private double radius;

    private Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }
}