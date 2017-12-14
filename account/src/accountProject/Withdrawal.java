
package accountProject;

public class Withdrawal extends Transactions {
    
    public Withdrawal (int amount){
        
        super(amount);
                
    }

    @Override
    public void print (){
    System.out.println(super.toString()+" withdrawal");
}

    
}
