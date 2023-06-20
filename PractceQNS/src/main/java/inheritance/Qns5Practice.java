package inheritance;

class BankAccount{
   String accountNumber;
   double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){

    }
}
class SavingAccount extends BankAccount{
    public SavingAccount(String accountNumber, double balance) {
        super (accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if(amount<balance){
            amount -= balance;
        }
        System.out.println ("balance is " );
    }

}
