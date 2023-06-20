package collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionPractice1 {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers=new ArrayList<Integer> ();
        myNumbers.add(13);
        myNumbers.add (15);
        myNumbers.add (16);
        myNumbers.add (17);
        myNumbers.add (18);
        Collections.sort(myNumbers);
        for(int i:myNumbers){
            System.out.print (i+" " );
        }
    }
}
