package assignmentDay2;

import java.util.Scanner;

public class Qns1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        if(num>=50){
            System.out.println("Pass");
        }else {
            System.out.println("Fai");
        }
    }
}
