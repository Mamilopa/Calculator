
package accountProject;

import java.util.Date;

public abstract class Transactions {//super class
    
private int id;
private Date timeStamp;//import util.Date
private int amount;

private static int nTransactions; //counter
// tänk vilka kan constructor initialize själv - och vilka behöver vi methods eller variabler för 

public Transactions (int amount){//constructor
    this.amount = amount;
 nTransactions++;
 id= nTransactions;
 timeStamp = new Date();
 
}

    public int getId() {
        return id;
    }




@Override    
public String toString (){
    return timeStamp+ " [" + id +"] "+ amount;
    }
public abstract void print();//tvingar subclasses
}
