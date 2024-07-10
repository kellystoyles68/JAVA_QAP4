public class Circle2  extends Shape and implementing Scalable {
    private double radius;

    public Circle2 (double radius){
        this.radius = radius;
    }
    @Override
    public void Circle2 draw() {
        System.out.println ("Drawing a Circle with a radius equal to: " + radius);
    }

    @Overide 
    public void scale (double factor) {
        radius = radius * factor;
    }

    @Override
    public String toString () {
        return "Circle with radius: " + radius;
    }

}
