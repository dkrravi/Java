// 4.Create a class Book with instance variables title, author, and price. Use constructors to initialize these variables. Create objects using the constructor and display the book details.

// Parameterized Constructor

public class BooksObj {
    String title;
    String author;
    double price;
    
    BooksObj(String t, String a, double p){
        title = t;
        author = a;
        price = p;
    }
    
    void display(){
        System.out.println("Title: " +title + ",Author: " +author + ", Price:  " +price);      
    }
    
}

class Main{
    public static void main(String[] args){
        BooksObj b1 = new BooksObj("Wings of Fire","APJ",1000.0);
        BooksObj b2 = new BooksObj("The Alchemist","Paulo",1200.0);
        b1.display();
        b2.display();
    }
}


/*
Title: Wings of Fire,Author: APJ, Price:  1000.0
Title: The Alchemist,Author: Paulo, Price:  1200.0
*/