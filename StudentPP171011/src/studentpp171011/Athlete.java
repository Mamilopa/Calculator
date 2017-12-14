package studentpp171011;

public class Athlete extends PersonSuper {

    private int medals;

    public Athlete(int age, String name, String address, int medals) {
        super(age, name, address);
        this.medals = medals;
    }

    public int getMedals() {
        return medals;
    }

    @Override
    public String toString() {
        return super.toString() + " Medals won: " + medals;
    }

}
