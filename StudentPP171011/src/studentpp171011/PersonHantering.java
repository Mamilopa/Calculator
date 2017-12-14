package studentpp171011;

import java.util.ArrayList;

public class PersonHantering {

    ArrayList<PersonSuper> personlista = new ArrayList<>();

    public void addToPersonList(PersonSuper ps) {
        personlista.add(ps);
    }

    @Override
    public String toString() {

        String str = "";

        for (PersonSuper person : personlista) {
 
            str = str + person.toString() + "\n";
        }
        return str;
    }
}
