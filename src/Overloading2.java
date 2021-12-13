//method overloading by changing data type
public class Overloading2 {


    public static int add(int a, int b){
        return a+b;
    }
    public static double add(double a, double b, double c){
        return a+b+c;
    }
}
class TestOverloading1{
    public static void main(String[] args) {
        System.out.println(Overloading2.add(2,3));
        System.out.println(Overloading2.add(2.1,3.1,4.1));
    }
}
