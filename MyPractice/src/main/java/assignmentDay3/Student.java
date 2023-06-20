package assignmentDay3;

public class Student {
    private String studentId;
    private String studentName;
    private int creditPoints;
    Student(String studentId,String studentName){
        if(studentId.length()>=3 && studentName.length()>=4){
            this.studentId=studentId;
            this.studentName=studentName;
        }
    }
    public String getLoginName(){
        return studentName.substring(0,4)+studentId.substring(0,3);
    }
    public void changeStudentName(String name){
        this.studentName=name;
    }
    public String getStudentName(){
        return studentName;
    }
    public String getStudentId(){
        return studentId;
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    public void addCredits(int credit){
        creditPoints=credit+creditPoints;
    }
    public String toString(){
        return "Student[Id="+studentId+",name="+studentName+",CreditPoint="+creditPoints+"]";
    }

}
