package assignmentDay3;

import java.time.LocalDate;

public class TestCustomer {
    public static void main(String[] args) {
        Customer c1=new Customer(101,"Abhishek", LocalDate.of(2001,6,21),"1214231542","abc@gmail.com",50000,"Software Engg",40000,16000,"ASE","Nucleus");
        System.out.println(c1);
        System.out.println(c1.calculateDBR());
        System.out.println(c1.calculateMaxEligibleEMI());
        System.out.println(c1.calculateEligibleLoanAmount());
    }
}
