public class Demo {
    public static void main(String[] args) {
        Shape [] shapes = new Shape [4];

        shapes[0] = new Circle (5);
        shapes[1] = new Ellipse(3,6);
        shapes[2] = new Triangle(5,6,8);
        shapes[3] = new EquilateralTriangle(6);
        for (Shape shape : shapes) {
            System.out.println(shape);
        }    }
}
