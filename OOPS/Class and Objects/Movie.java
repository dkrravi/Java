// 7.Write a program to create a class Movie with attributes like name, language, and rating. Add a method to check if rating is above 4.5 and return "Hit", otherwise "Average".


public class Movie {
    String name;
    String language;
    double rating;
    
    Movie(String name, String language, double rating){
     this.name = name;
     this.language = language;
     this.rating = rating;  
    }
    
    String getStatus() {
        if(rating > 4.5){
          return "Hit";
        }else{
             return "Average";
        }
    }
    
    void display(){
        System.out.println("----------");
        System.out.println("Name: " +name);
        System.out.println("Language: " +language);
        System.out.println("Rating: " +rating);
        System.out.println("Status: " +getStatus());
        System.out.println("----------");
        
    }
}

class Main{
public static void main(String[]args){
    Movie m1 = new Movie("Inception","English",7.0);
    Movie m2 = new Movie("Titanic","English",4.0);
    m1.display();
    m2.display();
    
}


}


/*

----------
Name: Inception
Language: English
Rating: 7.0
Status: Hit
----------
----------
Name: Titanic
Language: English
Rating: 4.0
Status: Average
----------

*/