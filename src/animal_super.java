//super used to invoke parent class constructor
public class animal_super {
    public animal_super() {
        System.out.println("animal is coming");
    }
}
class Dog extends animal_super{
    Dog(){
        super();
        System.out.println("Dog is coming ");
    }
}
class TestSuper2{
    public static void main(String[] args) {
        Dog d=new Dog();

    }
}
