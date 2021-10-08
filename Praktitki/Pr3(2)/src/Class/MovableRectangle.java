package Class;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed1, int ySpeed1, int xSpeed2, int ySpeed2) {
        topLeft = new MovablePoint(x1, y1, xSpeed1, ySpeed1);
        bottomRight = new MovablePoint(x2, y2, xSpeed2, ySpeed2);
    }
    @Override
    public void moveUp(double y) {
        this.topLeft.y += y;
        this.bottomRight.y += y;
    }
    @Override
    public void moveDown(double y) {
        this.topLeft.y -= y;
        this.bottomRight.y -= y;
    }
    @Override
    public void moveLeft(double x) {
        this.topLeft.x -= x;
        this.bottomRight.x -= x;
    }
    @Override
    public void moveRight(double x) {
        this.topLeft.x += x;
        this.bottomRight.x += x;
    }
    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}