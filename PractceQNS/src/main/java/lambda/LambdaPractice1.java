package lambda;

@FunctionalInterface
interface Interf{
    public int m1(int a, int b);
}

public class LambdaPractice1 {
    public static void main(String[] args) {
        //Using anonymous class for implementing interface
        /*Interf interf=new Interf ( ) {
            @Override
            public void m1() {
                System.out.println ("THis is first anonymous class" );
            }
        };
        interf.m1 ();*/

        //Using our interface with the help of lambda
        /*Interf interf = ()->{
            System.out.println ("Here i am abhishek" );
        };
        interf.m1 ();*/

        Interf interf = (a, b) -> a+b;
        System.out.println (interf.m1 (12,54) );


//        Function<Integer,Integer>adds=sum->a+b;

//        Function<Integer,Integer> f=i->i*i;
//        Predicate<Integer> f=i->i%2==0;
//        System.out.println (f.test (4) );
//        System .out.println (f.test (91) );
    }
}


