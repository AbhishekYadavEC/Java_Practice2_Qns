package assignmentDay2;

import java.util.Scanner;
public class Qns3 {
    private static void incometaxcal(double amount) {
        double tax=0;
        if(amount<=20000){
            tax=20000*0;
        }
        else if(amount>20000 && amount<=40000){
            tax=amount-20000*0.1;
        }
        else if(amount>40000 && amount<=60000){
            tax=(amount-40000)*0.2+20000*0.1;
        }
        else{
            tax=(amount-60000)*0.3+20000*0.2+20000*0.1;
        }
        System.out.println("its my income tax: "+tax);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double amount=sc.nextDouble();
        incometaxcal(amount);
        
    }


}
