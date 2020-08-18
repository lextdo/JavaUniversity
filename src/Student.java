public class Student {
    //this Student class has
    //three fields
    private String studentId;
    private String givenName;
    private String familyName;

    //this Student class has
    //two constructors
    public Student(String newStudentId){
        studentId = newStudentId;
    }

    public Student(String newStudentId, String newGivenName, String newFamilyName) {
        studentId = newStudentId;
        givenName = newGivenName;
        familyName = newFamilyName;
    }

    //this Student class has
    //two mutators
    public void setGivenName(String newGivenName) {
        givenName = newGivenName;
    }

    public void setFamilyName(String newFamilyName){
        familyName = newFamilyName;
    }

    //this Student class has
    //one method
    public String description() {
        return studentId + " " + givenName + " " + familyName;
    }
}
