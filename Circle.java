public class Circle extends Shape {
    private  double radius;

    public Circle (double radius ){
        super ("Circle");
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}

