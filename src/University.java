import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class University {
    private ArrayList<Unit> allUnits = new ArrayList<Unit>();


    //this University class has
    //5 methods
    private String readString(String prompt) {
        System.out.print(prompt);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)
        );
        String s = null;
        try {
            s = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    public void printStatus() {
        System.out.println("Welcome to Java University");
        System.out.println();
        createUnits();
        displayUnits();
        System.out.println("Thank you for using Java University");
    }

    public void createUnits(){

        Unit newUnit1 = new Unit("FIT1234", "Advanced Bogosorts");
        Unit newUnit2 = new Unit("FIT2027", "Introduction to Spaghetti Coding");
        Unit newUnit3 = new Unit("FIT3456", "Enterprise FizzBuzz");

        allUnits.add(newUnit1);
        allUnits.add(newUnit2);
        allUnits.add(newUnit3);

        Student newStudent1 = new Student(readString("Enter Student ID: "), readString("Enter Given Name: "), readString("Enter Family Name: "));
        Student newStudent2 = new Student(readString("Enter Student ID: "), readString("Enter Given Name: "), readString("Enter Family Name: "));
        Student newStudent3 = new Student(readString("Enter Student ID: "), readString("Enter Given Name: "), readString("Enter Family Name: "));

        allUnits.get(0).enrolStudent(newStudent1);
        allUnits.get(0).enrolStudent(newStudent2);
        allUnits.get(1).enrolStudent(newStudent3);
        allUnits.get(2).enrolStudent(newStudent3);

    }

    public void displayUnits(){
        for(int i=0; i < allUnits.size(); i++) {
            System.out.println(allUnits.get(i).description());
            System.out.println("Enrolled: ");
            allUnits.get(i).displayStudents();
            System.out.println();
        }
    }
}

