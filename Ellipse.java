public class Ellipse extends Shape {
    private double a; //major axis
    private double b ; //minor axis

    //initialize ellipse
    public Ellipse (double axis1, double axis2) {
      super( "Ellipse");
        if (axis1 > axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
    }
 }
 //calculate and return perimeter
 @Override
    public double getPerimeter() {
        return Math.PI * 2 *  Math.sqrt((a *a + b * b)/2.0);
    }  
 
    //claulate and return area
 @Override
    public double getArea (){
        return Math.PI * a * b;
    }
}
    


