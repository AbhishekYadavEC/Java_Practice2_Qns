package assignmentDay2;

import java.util.Scanner;

public class maxEligibleAmt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter monthly salary");
        int salary= sc.nextInt();
        System.out.println("Enter Effective monthly income rate");
        double rate=sc.nextDouble();
        maxEligibleAm(salary,rate);
    }

    private static void maxEligibleAm(int salary, double rate) {
        int tenure=7*12;//7 years in month
        double max_eligible_emi=(salary*0.5)*((1-0.2));//50% of effective monthly salary after deducting 20% DBR
        double r = rate / 12; //effective monthly rate

        double maxEligibleLoanAmt=(max_eligible_emi * ((Math.pow(1+r,tenure))-1)) / (r * (Math.pow(1+r,tenure)));
        System.out.println("Max Eligible Loan Amount: "+ maxEligibleLoanAmt);
    }
}
