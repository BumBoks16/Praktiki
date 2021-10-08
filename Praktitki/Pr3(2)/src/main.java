import Class.Movable;
import Class.MovablePoint;
import Class.MovableCircle;
import Class.MovableRectangle;
public class main {

    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 0, 0);
        System.out.println("point: \n" + point + "\n");

        MovableCircle circle = new MovableCircle(1, 0, 0, 0, 0);
        System.out.println("circle: \n"+ circle + "\n");

        MovableRectangle rectangle = new MovableRectangle(0, 0, 0, 0, 0, 0, 0, 0);
        System.out.print("rectangle: \n" + rectangle);
    }
}