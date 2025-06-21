/*

INTERFACE CONCEPT INSTEAD OF (MULTIPLE INHERITANCE)

Create an interface Animal with a method makeSound(). 
Implement it in multiple classes like Dog, Cat, and Cow. 
Write a program to call their sounds using the interface reference."
*/


interface Animal {
    void makesound();
}

class Dog implements Animal {
    public void makesound(){
        System.out.println("Dog Barks");
    }
}

class Cat implements Animal {
    public void makesound(){
        System.out.println("Cat Meows");
    }
}

class Cow implements Animal {
    public void makesound(){
        System.out.println("Cow Moo");
    }
}

public class Main{
    public static void main(String[] args){
       Animal a;
       a = new Dog();
       a.makesound();
       
       a = new Cat();
       a.makesound();
       
       a= new Cow();
       a.makesound();
    }
}


/*
Dog Barks
Cat Meows
Cow Moo
*/