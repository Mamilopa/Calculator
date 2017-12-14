package studentpp171011;

import java.util.ArrayList;

public class Student extends PersonSuper {

    private String schoolName;
    private String program;
    
    ArrayList <Double> gradelist = new ArrayList <> ();
    
    
    public Student(int age, String name, String address, String schoolName, String program) {
        super(age, name, address);
        this.schoolName = schoolName;
        this.program = program;
            }

    public String getSchoolName() {
        return schoolName;
    }

    public String getProgram() {
        return program;
    }
    
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double calculateAverageGrade() {
        double sum=0;
        for (Double double1 : gradelist) {
            sum+=double1;
                    }
        return sum/gradelist.size();
    }

    public void addGrade (double gr){
        gradelist.add(gr);
    }

    @Override
    public String toString() {

        return super.toString() + " " + schoolName + " " + program + " " + calculateAverageGrade();
    }

}
