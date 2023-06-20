package assignmentDay3;

public class Account {
    private String id;
    private String name;
    private int balance=0;
    private int accountNumber;
    private String accountType;
    public Account(){
        this.id="0";
        this.name="NA";
        this.balance=0;
    }
    public Account(int accountNumber,String accountType){
        this.accountNumber=accountNumber;
        this.accountType=accountType;
    }
    Account(String id,String name){
        this.id=id;
        this.name=name;
    }

    Account(String id,String name,int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    public String getId() {
        return id;
    }

    public String getName(){
        return name;
    }


    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        balance= balance+amount;
        return balance;
    }
    public int debit(int amount){
        if(amount<=balance){
            balance=balance-amount;
        }
        else {
            System.out.println("Amount Exceeded balance");
        }
        return balance;
    }
    public int transferTo(Account account,int amount){
        if(this.balance<amount){
            System.out.println("Amount exceed");
        }
        else {
            account.balance=account.balance+amount;
            this.balance=this.balance-amount;
        }
        return this.balance;
    }
    public String toString(){
        return "Account[id="+id+",name="+name+",balance="+balance+"]";
    }
}
