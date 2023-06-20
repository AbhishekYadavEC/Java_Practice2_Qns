package assignmentDay2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calculationLTV {
    public static void calculationLTV(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Loan Amount");
        int loan_amount= sc.nextInt();
        System.out.println("Enter Poperty Amount");
        int property_amt=sc.nextInt();
        int total_LTV=(loan_amount/property_amt)*100;
        if(total_LTV<=80)
            System.out.println("You will give Lowest Interest Rate on LTV ratio " +total_LTV);
        else
            System.out.println("Your interest charge will be increase on LTV ratio " +total_LTV);
    }
    public static void main(String[] args) {
        calculationLTV();
    }
}
