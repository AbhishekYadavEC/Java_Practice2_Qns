package assignmentDay3;

import java.time.LocalDate;
import java.util.Scanner;

public class Customer {
    private int customerId;
    private String customerName;
    private LocalDate dateofBirth;
    private String contactNumber;
    private String emailAddress;
    private double monthlyIncome;
    private String proffession;
    private double totalMonthlyExpense;
    private double maxELigibleLoanAmount;
    private String designation;
    private String companyName;

    public Customer(int customerId, String customerName, LocalDate dateofBirth, String contactNumber, String emailAddress, double monthlyIncome, String proffession, double totalMonthlyExpense, double maxELigibleLoanAmount, String designation, String companyName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.dateofBirth = dateofBirth;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.monthlyIncome = monthlyIncome;
        this.proffession = proffession;
        this.totalMonthlyExpense = totalMonthlyExpense;
        this.maxELigibleLoanAmount = maxELigibleLoanAmount;
        this.designation = designation;
        this.companyName = companyName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public String getProffession() {
        return proffession;
    }

    public double getTotalMonthlyExpense() {
        return totalMonthlyExpense;
    }

    public double getMaxELigibleLoanAmount() {
        return maxELigibleLoanAmount;
    }

    public String getDesignation() {
        return designation;
    }

    public String getCompanyName() {
        return companyName;
    }
    public double calculateDBR(){
        return totalMonthlyExpense/monthlyIncome;
    }
    public double calculateMaxEligibleEMI(){
        return monthlyIncome * 0.5 * (1 - 0.2);
    }
    public double calculateEligibleLoanAmount() {//this method is printing as well as returning eligibleLoanAmount
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter monthly rate");
        int monthlyRate = scan.nextInt();
        System.out.println("Enter tenure");
        int tenure = scan.nextInt();
        double eligibleLoanAmt = (calculateMaxEligibleEMI() * ((Math.pow(1 + monthlyRate, tenure)) - 1)) / (monthlyRate * (Math.pow(1 + monthlyRate, tenure)));
        System.out.println("Elegible loan amount is :" + eligibleLoanAmt);
        return eligibleLoanAmt;
    }
    public String toString(){
        return "Customer[CustomerId="+customerId+",CustomerName="+customerName+",DateOfBirth="+dateofBirth+",ContactNumber="+contactNumber+",EmailAddress="+emailAddress+",MonthlyIncome="+monthlyIncome+",Profession="+proffession+",TotaMonthlyExpense="+totalMonthlyExpense+",MaxEleigibleLoanAmunt="+maxELigibleLoanAmount+",Designation="+designation+",CompanyName="+companyName+"]";
    }
}
