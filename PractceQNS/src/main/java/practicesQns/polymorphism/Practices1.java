package practicesQns.polymorphism;




public class Practices1 {
    void show(Object a){
        System.out.println ("Object Method" );
    }
    void show(String a){
        System.out.println ("String Method" );

    }
//if we will give the same method name without arguments in class then compiler will be confuse after getting ambiguity problem.
    public static void main(String[] args) {
        Practices1 practices1=new Practices1 ();
//        practices1.show ("Abhishek");
        practices1.show ("Mukesh");
    }
}
