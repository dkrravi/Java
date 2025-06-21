/*

Person ➤ base class (with name, age)
Student ➤ inherits from Person (adds roll number, course)
Result ➤ inherits from Student (adds marks, grade)

*/

package inheritance;

class Persons {
    String name;
    int age;
    
    void setDetails(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    void display(){
        System.out.println("Name:  " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Persons {
    int rollno;
    String course;
    
    void setStu(int rollno, String course){
        this.rollno = rollno;
        this.course = course;
    }
    
    void displayStu(){
        System.out.println("Rollno:  " + rollno);
        System.out.println("Course: " + course);
    }
}

class Result extends Student {
    int marks;
    String grade;
    
    void setResult(int marks, String grade){
        this.marks = marks;
        this.grade = grade;
    }
    
    void displayResult(){
        System.out.println("Marks:  " + marks);
        System.out.println("Grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args){
        Result s = new Result();
        s.setDetails("Dhanya", 21);
        s.setStu(13, "MSc CS");
        s.setResult(473, "A");
        s.display();
        s.displayStu();
        s.displayResult();
    }
}

/*
Name:  Dhanya
Age: 21
Rollno:  13
Course: MSc CS
Marks:  473
Grade: A
*/
