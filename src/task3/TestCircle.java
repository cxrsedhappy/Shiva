package task3;

public class TestCircle {
    Circle[] array = new Circle[]{};
    int arrayCount = array.length;

    public static void main(String[] args) {

    }

    public Circle getBiggestCircle(){
        Circle biggest = array[0];
        for (Circle circle : array){
            if (biggest.getRadius() < circle.getRadius()) {
                biggest = circle;
            }
        }
        return biggest;
    }

    public Circle getLittleCircle(){
        Circle little = array[0];
        for (Circle circle : array){
            if (little.getRadius() > circle.getRadius()) {
                little = circle;
            }
        }
        return little;
    }
}