//A copy constructor is a constructor that creates a new object by copying the fields of an existing object.


public class CopyConstructor {
    String name;
    int age;
    
    CopyConstructor(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    CopyConstructor(CopyConstructor c){
         this.name = c.name;
         this.age = c.age;
    }
    
    void display(){
        System.out.println("Name:  "+name + " Age:  "+age);
    }
}

class Main{
    public static void main(String[]args){
        CopyConstructor c1 = new CopyConstructor("Dhanya",21);
        CopyConstructor c2 = new CopyConstructor(c1);
        c1.display();
        c2.display();
    }
}

/*
Name:  Dhanya Age:  21
Name:  Dhanya Age:  21

*/
