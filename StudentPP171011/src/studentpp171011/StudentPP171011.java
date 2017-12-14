
package studentpp171011;

public class StudentPP171011 {

    public static void main(String[] args) {
        
Student stud1 = new Student (34, "Pauline", "Äppelstigen", "Lexicon", "Java");
Student stud2 = new Student (56,"Anna", "Hejgatan"," Lexicon", "Java");
Student stud3 = new Student (15,"Åsa", "Gågatan"," Lexicon", "C++");
Athlete ath1= new Athlete (45, "Lena", "Trädgårdsvägen", 5);
Athlete ath2= new Athlete (23, "Peter", "Uvgatan", 3);
Athlete ath3= new Athlete (46, "Lova", "Pergatan", 12);
Employee emp1= new Employee (45, "Lena Ph", "Popvägen", 5000);
Employee emp2= new Employee (34, "Johanna", "Päronvägen", 40000);
Employee emp3= new Employee (57, "Gabriel", "Langvägen", 3000);
       
   stud1.addGrade(4);
        stud1.addGrade(4);
        stud1.addGrade(4);
        stud2.addGrade(5);
        stud2.addGrade(5);
        stud2.addGrade(1);
        stud3.addGrade(3);
        stud3.addGrade(2);
        stud3.addGrade(4);

PersonHantering lista1 = new PersonHantering();

lista1.addToPersonList(stud1);
lista1.addToPersonList(stud2);
lista1.addToPersonList(stud2);
lista1.addToPersonList(ath1);
lista1.addToPersonList(ath2);
lista1.addToPersonList(ath3);
lista1.addToPersonList(emp1);
lista1.addToPersonList(emp2);
lista1.addToPersonList(emp3);

        System.out.println(lista1);
       
         System.out.println(stud1.getName()+ "s betyg: "+stud1.gradelist);
         System.out.println(stud2.getName()+ "s betyg: "+stud2.gradelist);
         System.out.println(stud3.getName()+ "s betyg: "+stud3.gradelist);
         
        // System.out.println(stud2.getGradelist());
        System.out.println(stud1.calculateAverageGrade());
        System.out.println(stud2.calculateAverageGrade());
        System.out.println(stud3.calculateAverageGrade());
        
//        System.out.print(stud1.getName()+ " ");
//        System.out.print(stud1.getAddress()+ " ");
//        System.out.print(stud1.getProgram()+ " ");
//        System.out.print(stud1.getSchoolName()+ " ");
//        System.out.println(stud1.getAge()+ " ");
//        System.out.println(stud2.getAge()+ " ");
//        System.out.println(ath1.getAge()+ " ");
//    
     }
    
}
