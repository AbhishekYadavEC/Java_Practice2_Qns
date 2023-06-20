package assignmentDay2;

import java.util.Scanner;

public class calculatDBR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dbrCalculation();
    }

    private static void dbrCalculation() {
        int monthly_rent=1200;
        int credit_Card_Payment=2200;
        int car_Loan=12000;
        int student_Loan=8900;
        int total_Emi_Amt=monthly_rent+credit_Card_Payment+car_Loan+student_Loan;
        int monthly_Income=50000;
        int Total_DBR=(total_Emi_Amt*100)/monthly_Income;
        if(Total_DBR<=20){
            System.out.println("Approved");
        }
        else {
            System.out.println("Rejected");
        }

    }
}
