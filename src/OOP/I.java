package OOP;

class A{
    A(){
        System.out.println("Class A constructor called.");
    }
    void display(int a){
        System.out.println("Parent Class");
    }
}
class B extends A{
    B(){
        System.out.println("Class B constructor called.");
    }
    void display(){
        System.out.println("Child class");
    }
}
public class I {
    public static void main(String[] args) {


        B ob = new B();
        ob.display(4);
    }

}
