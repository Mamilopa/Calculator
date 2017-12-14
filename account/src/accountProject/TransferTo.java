
package accountProject;

public class TransferTo extends Transactions {
    private Account to;
    
    public TransferTo (int amount, Account to){//constructor skickar amount till super, to filed är special till den subclass  
        
        super(amount);
        this.to = to;
    }
    @Override
    public void print(){
        
        System.out.println(super.toString()+ " transfer to "+ to.getOwner());
        
    }
    
}
