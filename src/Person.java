public class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class Emp extends Person{
    double Salary;

    public Emp(int id, String name, double salary) {
        super(id, name);
        Salary = salary;
    }
    void display(){
        System.out.println("displaying details:" + id   + name  + Salary);
    }
}
class Demo{
    public static void main(String[] args) {
        Emp obj=new Emp(123,"Shubhi",1000.09);
        obj.display();
    }
}
