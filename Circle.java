public class Circle extends Shape {
    private  double radius; //radius of a circle

    //initialize circle
    public Circle (double radius ){
        super ("Circle");
        this.radius = radius;
    }

    //calculate and return area 
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    //calculate and return perimeter
    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}

