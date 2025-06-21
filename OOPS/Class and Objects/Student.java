public class Student {
    String name;
    int age;
    
    void display(){
        System.out.println("Name: " +name + ",Age: " +age);
    }
}
  class Main{
     public static void main(String[]args){
         Student s1 = new Student();
         s1.name = "Dhanya";
         s1.age = 23;
         s1.display();       
     }
 }

/*
Name: Dhanya,Age: 23
*/