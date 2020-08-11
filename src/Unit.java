public class Unit {
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
    //one method
    public String getUnitDescription() {
        return unitCode + " " + name;
    }

}
