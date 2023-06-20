package inheritance;

class Animal{
    public void makeSound(){
        System.out.println ("Animal has good sound" );
    }
}
class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println ("Cat is barking" );
    }
}
public class Qns2Practice {
    public static void main(String[] args) {
        Animal cat=new Cat ();
        cat.makeSound ();
    }
}
