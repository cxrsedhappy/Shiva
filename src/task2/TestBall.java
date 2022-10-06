package task2;

public class TestBall {
    public static void main(String[] args) {

        Ball bob = new Ball();
        System.out.println("Bob's ball info: " + bob.toString());
        bob.move(10, 10);
        System.out.println("Bob's ball info after move(): " + bob.toString());
        bob.setXY(3, 3);
        System.out.println("Bob's ball info after setXY(): " + bob.toString());

        Ball tom = new Ball(100, 100);
        System.out.println("Tom's ball x, y: " + tom.getX() + " " + tom.getY());
        tom.setX(5);
        tom.setY(5);
        System.out.println("Tom's ball x, y after setX(), setY(): " + tom.getX() + " " + tom.getY());

    }
}