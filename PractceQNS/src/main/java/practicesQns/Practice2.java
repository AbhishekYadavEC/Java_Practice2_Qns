package practicesQns;


class Animal{
    public void makeSound(){
        System.out.println ("Animal Make a sound" );
    }
}
class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println ("Cat make a sound" );
    }
}
public class Practice2 {
    public static void main(String[] args) {
        Animal animal=new Animal ();
        animal.makeSound ();
        Cat cat=new Cat ();
        cat.makeSound ();
    }
}
