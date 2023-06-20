package practicesQns;
class Vehicle{
    public void drive(){
        System.out.println ("Reparing a Car " );
    }
}
class Car extends Vehicle{

    @Override
    public void drive() {
        System.out.println ("Reparing a Car" );
    }
}

public class Practice3 {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle ();
        vehicle.drive ();
        Car car=new Car ();
        car.drive ();
    }
}
