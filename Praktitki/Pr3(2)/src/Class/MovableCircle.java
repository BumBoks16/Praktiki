package Class;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    @Override
    public void moveUp(double y) {
        this.center.y += y;
    }
    @Override
    public void moveDown(double y) {
        this.center.y -= y;
    }
    @Override
    public void moveLeft(double x) {
        this.center.x -= x;
    }
    @Override
    public void moveRight(double x) {
        this.center.x += x;
    }
    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}