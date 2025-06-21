//  Write a Java program to create a class Employee with fields id, name, and salary. Create two objects and display their details.


public class EmployeeObj {
    int empid;
    String name; 
    float salary;
    
    void display(){
        System.out.println("Id: " +empid + ",Name: " +name + ", Salary: " +salary);
    }
}

class Main{
    public static void main(String[]args){
        EmployeeObj e1 = new EmployeeObj();
        EmployeeObj e2 = new EmployeeObj();
        e1.empid = 13;
        e1.name = "Dhanya";
        e1.salary = 25000;
        e1.display();
        
        e2.empid = 16;
        e2.name = "Venaktesh";
        e2.salary = 29000;
        e2.display();
    }
}


/*
Id: 13,Name: Dhanya, Salary: 25000.0
Id: 16,Name: Venaktesh, Salary: 29000.0
*/