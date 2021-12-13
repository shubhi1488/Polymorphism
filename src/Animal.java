//Super keyword used to refer the instance variable of the class
public class Animal {
    String color="White";
}
class Dog extends Animal{
    String color="Black";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);//with the help of super keyword we can access the value of instance
        //variable color of parent class Animal which is extended by child class Dog.
    }
}
//we create another class to create the object of Dog child class in order to call the method
class TestColor{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.printColor();
    }
}
