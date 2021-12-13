//parent class which have two mwthods foo() and print()
public class A1 {
    A1 foo(){
        return this;
    }
    void print(){
        System.out.println("inside A1 class");
    }
}
//class A2 is the sub class of parent class A1
class A2 extends A1{
    @Override
    A2 foo(){
        return this;
    }
    void print(){
        System.out.println("inside A2 class");
    }
}
class A3 extends A2{
    @Override
    A3 foo(){
        return this;
    }
    @Override
    void print(){
        System.out.println("inside A3 class");
    }
}
//we donot need to typecast because of the use of covarient return type.
class CovarientExample{
    public static void main(String[] args) {
        A1 a1=new A1();
        a1.foo().print();
        A2 a2=new A2();
        a2.foo().print();
        A3 a3=new A3();
        a3.foo().print();

    }
}
