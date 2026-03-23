package basics;

// We can implement a class with multiple interfaces
public class Interface implements Car {

    public void start(){
        System.out.println("started");
    }
    public static void main(String[] args) {
        
    }

}

interface Car {
    // the methods implemented under interface classes are by default public and abstract 
    // method start is by default public and abstract
    void start ();

    // in an interface class we cannot make abstract functions as well i.e in which you can specify the body. Interfaces only allow abstract methods in it 
    // void breaks(){
    //     System.out.println("car has breaks");
    // }
}