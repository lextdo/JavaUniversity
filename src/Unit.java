import java.util.ArrayList;

public class Unit {
    private ArrayList<Student> enrolledStudents = new ArrayList<Student>();

    //the Unit class has
    //two fields
    private String unitCode;
    private String name;

    //the Unit class has
    //one constructor
    public Unit(String newUnitCode, String newName) {
        unitCode = newUnitCode;
        name = newName;
    }

    //the Unit class has
    //two methods
    public String description() {
        return unitCode + " " + name;
    }

    public void enrolStudent(Student newStudent) {
        enrolledStudents.add(newStudent);
    }

    public void displayStudents() {
        for (int i=0; i < enrolledStudents.size();i++){
            System.out.println(enrolledStudents.get(i).description());
        }
    }

}
