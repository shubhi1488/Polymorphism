//method overriding
//creating the parent class
public class Vehicle {
    void run(){
        System.out.println("Vehicle is running");
    }

}
//creating the subclass(child class that will have same method name as of parent class)
class Bike extends Vehicle{
    //creating the same name method as of parent class to override it
    void run(){
        System.out.println("Bike is running");
    }

    public static void main(String[] args) {
        //creating the object of the subclass to call the method
        Bike obj=new Bike();
        //method call
        obj.run();
    }
}
