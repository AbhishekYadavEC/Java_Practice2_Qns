package practicesQns.polymorphism.methooverriding;


class Test{
    void show(){
        System.out.println (666 );
    }
}
class myTest extends Test{
    @Override
    void show() {
        System.out.println (4554 );
    }
}
public class Overriding {
    public static void main(String[] args) {
        Test test=new Test ();
        test.show ();

        myTest myTest=new myTest ();
        myTest.show ();
    }
}
