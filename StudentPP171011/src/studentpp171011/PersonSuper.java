package studentpp171011;

import java.util.ArrayList;

public abstract class PersonSuper {
    
    private int age;
    private String name;
    private String address;

    public PersonSuper(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

  public String toString () {
      
      return age + " "+ name+ " " + address;
      
  }
    }
    
    

