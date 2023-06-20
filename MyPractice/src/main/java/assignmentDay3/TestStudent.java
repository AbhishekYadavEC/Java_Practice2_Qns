package assignmentDay3;

public class TestStudent {
    public static void main(String[] args) {
        Student s1=new Student("S110","Abhishek");
        System.out.println(s1);
        Student s2=new Student("S102","Bantu");
        System.out.println(s2);
        Student s3=new Student("S104","Mukesh");
        System.out.println(s3);
        Student s4=new Student("C103","Ravi");
        System.out.println(s4);
        Student s5=new Student("C104","Anuj");
        System.out.println(s5);
        System.out.println(s5.getLoginName());
        s5.changeStudentName("Munna");
        System.out.println(s5);
        System.out.println(s2.getStudentId());
        System.out.println(s2.getLoginName());
        s3.addCredits(12);
        System.out.println(s3.getCreditPoints());

    }
}
