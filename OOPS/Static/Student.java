/*
A static variable is a class-level variable that is shared by all objects of the class.
It is declared using the static keyword and initialized only once.
It can store common values like college name, interest rate, or PI.
Its value can be changed, but the change reflects in all objects.

*/
public class Student {
    String name;
    static String college = "NGP";
    
    Student(String name){
        this.name = name;
    }
    
    void display(){
        System.out.println("Name:  " +name);
        System.out.println("College: " +college);
    }
}
class Main{
    public static void main(String[]args){
        Student s1 = new Student("Dhanya");
        Student s2 = new Student("Venkatesh");
        
        s1.display();
        s2.display();
        
        Student.college = "PSG";
        s1.display();
        s2.display();
        
    }
}

/*

Name:  Dhanya
College: NGP
Name:  Venkatesh
College: NGP
Name:  Dhanya
College: PSG
Name:  Venkatesh
College: PSG

*/