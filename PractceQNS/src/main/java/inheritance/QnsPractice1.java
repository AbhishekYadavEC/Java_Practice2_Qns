package inheritance;


class P{
    public void m1(){
        System.out.println ("Parent" );
    }
}
class Q extends P{
    public void m2(){
        System.out.println ("Child" );
    }

}
public class QnsPractice1 {
    public static void main(String[] args) {
        Q p=new Q ();
        p.m1 ();
        p.m2();
    }
}
