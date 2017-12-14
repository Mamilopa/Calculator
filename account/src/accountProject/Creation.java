package accountProject;

public class Creation extends Transactions{

public Creation (){
    super (0); //0 istället för amount eftersom creation
}
@Override
public void print (){
    System.out.println(super.toString()+ " created");// kan göras på olika sätt, detta för att visa abstract etc
}    
}
