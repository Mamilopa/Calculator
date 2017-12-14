
package studentpp171011;

public class Employee extends PersonSuper {

private int salary;    
    
    public Employee(int age, String name, String address, int salary) {
        super(age, name, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
@Override
public String toString(){
    
    return super.toString() + " Salary: " +salary;
}
    
}
