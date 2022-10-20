package task3;

import java.util.Random;

public class Circle {
    private Point center;
    private double radius;

    Random random = new Random();

    private Circle(){
        this.center = new Point(
                random.ints(1, 100).findFirst().getAsInt(),
                random.ints(1, 100).findFirst().getAsInt()
        );
        this.radius = random.ints(1, 100).findFirst().getAsInt();
    };

    private Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }
}
