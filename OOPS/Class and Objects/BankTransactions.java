// 5.Create a class BankAccount with fields accountNumber, accountHolderName, and balance. Include methods to deposit, withdraw, and displayBalance. Test the class with different transactions.


public class BankTransactions {
    int accNum;
    String accHolderName;
    double balance;
    
    BankTransactions(int n, String na, double b){
        accNum = n;
        accHolderName = na;
        balance = b;
    }
    
    void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount Deposited Successfully");
        }else{
            System.out.println("Invalid Amount");
        }
    }
    
    void withdraw(double amount){
        if(amount > 0 && amount < balance){
            balance -= amount;
            System.out.println("Amount Withdraw Sucessfully");
        }else{
            System.out.println("No sufficient balance.");
        }
    }
    
    void display(){
        System.out.println("-----------");
        System.out.println("Name:  " +accHolderName);
        System.out.println("Account No:  " +accNum);
        System.out.println("Balance:  " +balance);
        System.out.println("-----------");
    }   
}

class Main{
public static void main(String[]args){
  BankTransactions b1 = new BankTransactions(123456,"Dhanya",12000.0);
  b1.withdraw(100.0);
  b1.deposit(200.0);
  b1.display();
  
}
}

/*
Amount Withdraw Sucessfully
Amount Deposited Successfully
-----------
Name:  Dhanya
Account No:  123456
Balance:  12100.0
-----------
*/