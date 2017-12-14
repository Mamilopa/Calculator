package accountProject;

import java.util.ArrayList;

public class Account {

    private String owner;//field
    private int balance;
    private int number;

ArrayList<Transactions> transactions;//se constructor; import


    private static int nAccount = 0; //genererar unikt acc no i ordning

    public Account(String owner) {//owner här är parameter (kan heta vad som helst om man vill), constructor - initializes all fields for the object. method
        this.owner = owner; //this. means pointing to field (= owner som är parameter) utan this. blir owner= owner doesn't make sense
        balance = 0;
        nAccount++;
        number = nAccount;
        transactions=new ArrayList<>();
        transactions.add(new Creation());
    }

    public void deposit(int amount) {
        balance += amount;
transactions.add (new Deposit(amount));//vi har en class Deposit (snart) och nu skapar vi en object av den klassen som ska in i arraylistan transaction
    }

    public void withdraw(int amount) {
        if (amount <= balance) {//checking
            balance= balance - amount;
            transactions.add(new Withdrawal(amount));
        } else {
            System.out.println("Not enough money");
        }
    }

    public void transferTo(int amount, Account other) {//Account kommer från classen Account. när vi kallar metoden byter vi other till account det ska till
        if (amount <= balance) {//checking
            balance -= amount;// kan skriva this.balance också. sker hos anna
            other.balance = other.balance + amount;// sker hos ulf
            this.transactions.add(new TransferTo(amount,other));
//skickar info för ulfs account. i Class TransferTo behöver vi amount och den andras konto
            other.transactions.add(new TransferFrom(amount, this));//skickar info för annas account. i Class TransferTo behöver vi amount och den andras konto
        } else {
            System.out.println("Not enough money");

        }

    }
    public void printAll (){
        System.out.println(number + "/" + owner + ": " + balance);
        System.out.println("Transactions:");
        for (Transactions t : transactions) { //C++ for each Transaction t in transations)
            t.print();
        }
    }
    
    public String getOwner (){
        return owner;
    }
}
