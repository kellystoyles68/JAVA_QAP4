public class Triangle extends Shape{
    private double side1, side2, side3; 


//initalixe triangle
    public Triangle (double side1, double side2, double side3){
        super ("Triangle");
        if (isValidTriangle (side1,side2,side3)){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        }else{
            throw new IllegalArgumentException("Invalid side lengths");
        }

    }
    //validate that it is a triangle
    private boolean isValidTriangle(double side1, double side2, double side3){
        return (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2);
    }

        //calcalate and return perimeter
    @Override
    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    //calculate and return area
    @Override
    public double getArea(){
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

