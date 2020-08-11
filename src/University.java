public class University {
    private Unit[] allUnits = new Unit[3];

    public void printStatus() {
        System.out.println("Welcome to Java University");
        System.out.println();
        createUnits();
        displayUnits();
        System.out.println();
        System.out.println("Thank you for using Java University");
    }

    public void createUnits(){

        Unit newUnit1 = new Unit("FIT1234", "Advanced Coding");
        Unit newUnit2 = new Unit("FIT2099", "Java BOOTCAMP");
        Unit newUnit3 = new Unit("FIT2085", "MIPS and Death");

        allUnits[0] = newUnit1;
        allUnits[1] = newUnit2;
        allUnits[2] = newUnit3;
    }

    public void displayUnits(){
        for(int i=0; i < allUnits.length; i++) {
            System.out.println(allUnits[i].getUnitDescription());
        }
    }
}
