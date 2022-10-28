package task6;

public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int dx;
    private int dy;

    public MovablePoint(int x, int y, int dx, int dy){
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
    }


    @Override
    public void moveUp() {
        this.y -= 1;
    }

    @Override
    public void moveDown() {
        this.y += 1;
    }

    @Override
    public void moveLeft() {
        this.x -= 1;
    }

    @Override
    public void moveRight() {
        this.y += 1;
    }

    public String toString(){
        return "Pos[" + x + ", " + y + "] Speed[" + dx + ", " + dy + "]";
    }
}
