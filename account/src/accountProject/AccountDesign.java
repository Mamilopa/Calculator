
package accountProject;


public class AccountDesign {

    
    public static void main(String[] args) {
           
        Account a1 = new Account ("Ulf");
        Account a2 = new Account ("Anna");
       
        a1.deposit(200);
        a1.withdraw(170);
        a2.deposit(300);
        a2.transferTo(100, a2);
        
       a1.printAll();//kallar metoden. i den finns sout
       a2.printAll();
       
       
        
    }
    
}
