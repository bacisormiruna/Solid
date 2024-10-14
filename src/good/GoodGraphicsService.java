package good;

public class GoodGraphicsService {
    public void checkForArea(Shape shape) {
        if (shape.getArea() > 0) {
            System.out.println("Shape has valid area: " + shape.getArea());
        } else {
            System.out.println("Shape area is invalid.");
        }
    }
}
