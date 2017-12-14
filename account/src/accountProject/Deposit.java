
package accountProject;

public class Deposit extends Transactions {

   public Deposit(int amount){//constructor (vi kallar på denna amount från Account och nedan skickar till super)
        super (amount);//vi måste kalla denna, annars väljs den utan parameter
        
    }
   @Override
   public void print(){
       System.out.println(super.toString()+" deposit"); //super. om man vill vara säker på att det är super och ingen annan 
    
}
}