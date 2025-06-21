/*
Single Inheritance: Person → Student
Interface 1: Sports
Interface 2: Academic
Final class Result combines all
*/


class Person {
    String name;
    int age;
    
    void setDetails(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    void display(){
        System.out.println("Name:  "+name);
        System.out.println("Age:  "+age);
    }
}

class Student extends Person {
    String course;
    
    void setcourse(String course){
        this.course = course;
    }
    
    void dis(){
        System.out.println("Course:  "+course);
    }
}


interface Sports {
    void sportsmarks();
}

interface Academics {
    void academicmarks();
}

class Result extends Student implements Sports, Academics {
    int smarks;
    int amarks;
    
    void setMarks(int smarks, int amarks){
        this.smarks = smarks;
        this.amarks = amarks;
    }
    
    public void sportsmarks(){
        System.out.println("Sports Marks:  " +smarks);
    }
    
    public void academicmarks(){
        System.out.println("Academic Marks:  " +amarks);
    }
    
    void displayTotal(){
        System.out.println("Total Marks:  " + (smarks + amarks));
    }
}

class main{
    public static void main(String[]args){
        Result r = new Result();
        r.setDetails("Dhanya", 21);
        r.setcourse("MSc");
        r.setMarks(89,90);
        r.display();
        r.dis();
        r.displayTotal();
    }
}

/*
Name:  Dhanya
Age:  21
Course:  MSc
Total Marks:  179
*/