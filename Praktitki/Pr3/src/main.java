import Class.Shape;
import Class.Circle;
import Class.Rectangle;
import Class.Square;
class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(12.5, "RED", false); // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        System.out.println(c1);
        System.out.println();

        Rectangle r1 = new Rectangle(5.4, 10.3, "Blue", true); // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        System.out.println();

        Square s4 = new Square(3.6, "Blue", true); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(s4.getSide());
    }
}