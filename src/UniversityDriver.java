public class UniversityDriver {
    public static void main(String[] args) {
        University newUniversity = new University(); //creates new University object (printStatus is not static create new object before calling it
        newUniversity.printStatus();
    }
}
