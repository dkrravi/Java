// Create a class Circle with a field radius and methods to calculate area and circumference. Accept input using constructor and display results.

public class Circle {
    double radius;
    
    Circle(double r){
     radius = r;
    }
    
    double area(){
        return Math.PI * radius * radius;
    }
    
    double circumference(){
        return 2 * Math.PI * radius;
    }
}

class Main{
    public static void main(String[]args){
        Circle c1 = new Circle(5.0);
        System.out.println("Area of Circle:  "+ c1.area());
        System.out.println("Circumference of Circle:  "+ c1.circumference());
    }
}


/*
Area of Circle:  78.53981633974483
Circumference of Circle:  31.41592653589793
*/