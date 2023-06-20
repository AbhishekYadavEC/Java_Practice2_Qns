package statics;

import java.util.TreeSet;

public class TestStudent {
    public static void main(String[] args) {
        TreeSet<Student> studentTreeSet=new TreeSet<> ();
        studentTreeSet.add (new Student ("Abhishek",834784));
        System.out.println (studentTreeSet );
    }
}
