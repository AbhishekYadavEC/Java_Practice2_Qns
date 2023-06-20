package basicPracticeQns;


class checkPrimeNumber{
    public static void Number(int n){
        if(n ==2){
            System.out.println ("prime number" );
        }
        else if (n%2 != 1) {
            System.out.println ("Not prime Number" );

        } else {
            System.out.println ("prime Number" );
        }
    }
}
public class PrimeNumber {
    public static void main(String[] args) {
        checkPrimeNumber.Number (17);
    }
}
