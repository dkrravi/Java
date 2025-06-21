// 2.Create a class Rectangle with fields length and breadth. Include a method area() to calculate area. Create objects and print their areas.


public class Rectangle {
    double length;
    double breadth;
    
    double area(){
       return  length * breadth;
    }
}

class Main{
    public static void main(String[]args){
        Rectangle r1 = new Rectangle();
        r1.length = 3.0;
        r1.breadth = 5.0;
        System.out.println("Area of Reactangle:  " + r1.area());
    }
}


/*
Area of Reactangle:  15.0
*/