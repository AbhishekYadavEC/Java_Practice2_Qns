package assignmentDay3;

import java.time.LocalDate;

public class Loan {
    private int loanAgreementId;
    private int loanProduct;

    private double loanAmount;
    private int tenure;
    private double roi;
    private double emiPerMonth;
    private LocalDate loanDisbursalDate;
    private int repaymentFrequency;

    public Loan(int loanAgreementId, int loanProduct, double loanAmount, int tenure, double roi, double emiPerMonth, LocalDate loanDisbursalDate, int repaymentFrequency) {
        this.loanAgreementId = loanAgreementId;
        this.loanProduct = loanProduct;
        this.loanAmount = loanAmount;
        this.tenure = tenure;
        this.roi = roi;
        this.emiPerMonth = emiPerMonth;
        this.loanDisbursalDate = loanDisbursalDate;
        this.repaymentFrequency = repaymentFrequency;
    }

    public int getLoanAgreementId(){
        return loanAgreementId;
    }

    public int getLoanProduct() {
        return loanProduct;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public int getTenure() {
        return tenure;
    }

    public double getRoi() {
        return roi;
    }

    public double getEmiPerMonth() {
        return emiPerMonth;
    }
    public LocalDate getLoanDisbursalDate() {
        return loanDisbursalDate;
    }

    public int getRepaymentFrequency() {
        return repaymentFrequency;
    }

    public void calculateEMI(){

    }
    public void generateRepaymentSchedule(){

    }
    public double calculateLatePenalty(){

    }
    public double calculateLoanToValueRatio(){

    }

}
