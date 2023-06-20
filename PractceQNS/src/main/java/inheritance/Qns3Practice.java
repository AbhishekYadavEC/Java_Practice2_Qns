package inheritance;

class Vehicle{
    public void drive(){
        System.out.println ("Drive the vehicle" );
    }
}
class Car extends Vehicle{
    @Override
    public void drive() {
        System.out.println ("Reparing a car" );
    }
}
public class Qns3Practice {
    public static void main(String[] args) {
        Vehicle vlc=new Car ();
        vlc.drive ();
    }
}
