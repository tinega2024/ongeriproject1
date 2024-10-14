public class Course {
    String unitCode;
    String unitTitle;
    public Course(String unitCode, String unitTitle) {
        this.unitCode = unitCode;
        this.unitTitle = unitTitle;
    }
    public void setUnitCode(String newUnitCode) {
        this.unitCode = newUnitCode;
    }
    public void setUnitTitle(String newUnitTitle) {
        this.unitTitle = newUnitTitle;
    }
    public String getUnitCode() {
        return this.unitCode;
    }
    public String getUnitTitle() {
        return this.unitTitle;
    }
    @Override
    public String toString() {
        return "UNIT CODE: " + unitCode + "\nUNIT TITLE: " + unitTitle;
    }
}
