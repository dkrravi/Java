// 3.Create a class Car with attributes brand, model, and price. Write a method to print car details. Create a main class and create objects for different cars.

public class Car {
    String brand;
    String model;
    double price;
    
    void display(){
        System.out.println("Brand:  " +brand+ ", Model:  " +model + ",Price: " +price);
    }
}

class Main{
    public static void main(String[]args){
        Car c1 = new Car();
        Car c2 = new Car();
        
        c1.brand = "Toyota";
        c1.model = "Camry";
        c1.price = 120000;
        
        c2.brand = "Tata";
        c2.model = "Harrier";
        c2.price = 130000;
        
        
        c1.display();
        c2.display();
    }
}

/*
Brand:  Toyota, Model:  Camry,Price: 120000.0
Brand:  Tata, Model:  Harrier,Price: 130000.0
*/