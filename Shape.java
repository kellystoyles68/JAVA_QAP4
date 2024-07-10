public abstract class Shape {
    protected String name; //name of shape
    
    //initalize shape
    public Shape(String name) {
        this.name = name;
    }
    
   //abstract method to get perimeter
    public abstract double getPerimeter();
    //abstract methos to get area
    public abstract double getArea();

    //return string representation of the shape
    @Override
    public String toString () {
        return "Shape: " + name + ", Perimeter: " + getPerimeter() + ", Area: " + getArea();
    }
}
