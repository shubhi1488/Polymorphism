//creating the parent class
public class Bank {
    int getRateOfInterest(){
        return 0;
    }
}
//creating the child class containing method of parent class
class SBI extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
class ICICI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class Axis extends Bank{
    int getRateOfInterest(){
        return 6;
    }
}
//creating the class for object creation and method calling
class TestOverriding{
    public static void main(String[] args) {
        SBI s=new SBI();
         ICICI I=new ICICI();
         Axis A=new Axis();
        System.out.println("Rate of Interest of SBI is:" +s.getRateOfInterest());
        System.out.println("Rate of Interest of ICICI is:"+I.getRateOfInterest());
        System.out.println("Rate of Ineterst of Axis is:"+A.getRateOfInterest());

    }
}
