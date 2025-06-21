// Hierarchial Inheritance

public class Person {
    String name;
    int age;
    
    void setDetails(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    void display(){
        
        System.out.println("Name:  " +name);
        System.out.println("Age:  " +age);
    }
}

class Student extends Person{
    String course;
    
    void setCourse(String course){
        this.course = course;
    }
    
    void dis(){
        System.out.println("Course:  " +course);
    }
}


class Teacher extends Person{
    String subject;
    
    void setSub(String subject){
        this.subject = subject;
    }
    
    void displayt(){
        System.out.println("Subject:  " +subject);
    }
}

class Main{
    public static void main(String[] args){
        Student s = new Student();
        s.setDetails("Dhanya", 21);
        s.setCourse("MSc");
        
        s.display();
        s.dis();
        
        
        Teacher t = new Teacher();
        t.setDetails("Suganthi",40);
        t.setSub("Big Data");
        
        t.display();
        t.displayt();
    }
}


/*
Name:  Dhanya
Age:  21
Course:  MSc
Name:  Suganthi
Age:  40
Subject:  Big Data
*/