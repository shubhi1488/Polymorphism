//super keyword used to invoke parent class method
public class animal1 {
    void eat(){
        System.out.println("eating.....");
    }
}
class Dog extends animal1{
    void eat() {
        System.out.println("eating bread....");
    }
    void bark(){
        System.out.println("barking.....");
    }
    void work(){
        super.eat();
        bark();
    }

}
class Testsuper{
    public static void main(String[] args) {
        Dog d= new Dog();
        d.work();
    }
}