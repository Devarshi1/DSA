package basics;

public class Abstraction {

    public static void main(String[] args) {

        // You cannot instantiate an abstract class i.e an absrtact class cannot have any objects because the class is abstract ( we consider it as an concept)
        // Car C1 = new Car ();

        Audi A1 = new Audi();
        A1.start();

        BMW B1 = new BMW();
        B1.start();
        
    }

}

class Audi extends Car {

    public void start(){
        System.out.println("Audi started");
    }

}

class BMW extends Car {

        public void start(){
        System.out.println("BMW started");
    }
}
abstract class Car {

    int price;
    // an abstract method does not have any implementation or definition.
    // since start is an absrtact method and class Audi and BMW implements class car , we compulsorily have to implement start method in the child classes
    // abstract methods can only be written in abstract classes
    abstract void start();

    // in an abstract class we can make abstract functions as well i.e in which I can specify the body 
    void breaks(){
        System.out.println("car has breaks");
    }
}

