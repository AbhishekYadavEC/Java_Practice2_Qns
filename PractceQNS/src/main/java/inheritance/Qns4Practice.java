package inheritance;

class Employee{
    public void work(){
        System.out.println ("Employee is good work" );
    }
    public void getSalary(){
        System.out.println ("Employee Salary is very nice" );
    }
}
class HRManager extends Employee{
    @Override
    public void work() {
        System.out.println ("Hiring the candidate" );
    }
    public void addEmployee(String empName){
        System.out.println ( "Added your Name: "+empName);
    }
}
public class Qns4Practice {
    public static void main(String[] args) {
        Employee emp=new Employee ();
        emp.work ();
        emp.getSalary ();

        HRManager hrManager=new HRManager ();
        hrManager.addEmployee ("Abhishek");
    }
}
