
package accountProject;

public class TransferFrom extends Transactions {
    
    private Account from;
    
    public TransferFrom (int amount, Account from){//constructor
    super(amount);
   this.from = from;
    }
   
    @Override
    public void print(){
        
        System.out.println(super.toString()+" transfer from" + from.getOwner());
    }
    
}
