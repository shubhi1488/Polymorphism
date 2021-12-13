//Method overloading by changing number of arguements
public class Overloading {
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }}
   class Test{
       public static void main(String[] args) {
           System.out.println(Overloading.add(2,3));
           System.out.println(Overloading.add(2,3,4));
       }
   }

