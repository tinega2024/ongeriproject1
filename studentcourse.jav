public class StudentCourse{
    String regNo;
    String fullNames;
    Course course:
    public StudentCourse(String regNo,String fullNames,Course course){
        this.regNo = regNo;
       this.fullNames=fullNames;
       this.course=course;
    }
    public void setregNo(String newReg){
        this.regNo = newReg;
    }
    public String getRegNo(){
        return this.regNo;
    }
    public void setNames(string newName){
        this.fullNames = newName;
    }
    public String getName(){
        return this.fullNames;
    }
    public void setCourse(Course obj ){
        this.course = obj;
    }
    public Course getCourse(){
        return this.course;
    }
    public String print(){
        return "Full Name:"+fullNames+"\n"+getCourse().toString();
    }

}