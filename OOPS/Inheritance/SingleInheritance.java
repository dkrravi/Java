public class Person {
    String name;
    int age;
    
    void setDetails(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    void displayDetials(){
        System.out.println("Name:  " +name);
        System.out.println("Age: "+age);
    }
}

class Student extends Person{
    String course;
    
    void setcourse(String course){
        this.course = course;
    }
    
    void displayCourse(){
        System.out.println("Course: " +course);
    }
}
class Main{
    public static void main(String[]args){
        Student p1 = new Student();
        p1.setDetails("Dhanya",21);
        p1.setcourse("Msc CS");
        p1.displayDetials();
        p1.displayCourse();
        
    }
}


/*

Name:  Dhanya
Age: 21
Course: Msc CS

*/