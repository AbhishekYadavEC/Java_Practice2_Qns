package practicesQns.comprableAndcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<Employee> employee = new ArrayList<> ( );

        employee.add (new Employee ("Thamesh", "873476378", 34));
        employee.add (new Employee ("Abhishek", "884348894", 311));
        employee.add (new Employee ("Rishabh", "8843434343", 78));
        System.out.println (employee);
        //using Comparator
        Collections.sort (employee,new IdComparator ());
        System.out.println (employee );

        //Comparable
        //System.out.println (employee );

        ArrayList<Employee>employee1=new ArrayList<> (employee);
        Collections.sort (employee1,new NameComparator());
        System.out.println ( employee1);

    }
}
