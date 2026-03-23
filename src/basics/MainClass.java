package basics;

import encapsulation.EncapsulationIntro;

class Developer extends Person {
    // super keywork is used to call the constr
    public Developer (int age, String name){
        super (age,name);
    }
    void doWork (){
        System.out.println(
            "The developer develops the code"
        );
    }
    // Example of runtime polymorphism
    void walk(){
        System.out.println("Devarshi , the developer is walking");
    }
}
class Manager extends Person {

}

class Person {
    String name ;
    int age;
    // Using static keywork u can make a property of a class, this property can be accessed with ClassName.PropertyName.
    // When any property is static it belongs to the class and not to objects of that class, hence accessing a static property doesnt require us to compulsorily create object of that class.
    // suppose every person/human belongs to biological class of mammalia
    static String biologicalClass = "Mammalia";
    static int count;

    void eat (){
        System.out.println(name + " is eating");
    }

    void walk (){
        System.out.println(name + " is walking");
    }
    // example of compile time polymorphism
    void walk (int steps){
        System.out.println(name + " walked " + steps + " " + "steps");
    }

    void doWork(){};

    // Constructor can be used when we want to initialize the object with certain properties (For eg - name & age)
    // Constructors can be overloaded
    public Person() {
        count++;
        System.out.println(count);
        // These constructors are called when the objects are created
        System.out.println("This is the default constructor for a person");
    }
    
    public Person (int age, String name){
        // with help of this keyword we can call a constructor from another constructor of the same class. In this case the constructor right above our constructor will be called 
        this();
        // age = newAge;
        // name = newName;
        // the second use of this keyword is to access the parameter of the current class. for eg - this.name points to the name parameter of the class which is declared on line 4 
        this.age = age;
        this.name = name;
    }

}
public class MainClass {
    public static void main (String [] args){
        // p1 - object reference 
        // Person - type of the reference 
        // new - keyword to create objects in java
        // Person() - default constructor
        Person p1 = new Person();
        Person p2 = new Person ();
        Person p3 = new Person (33, "Amay");
        System.out.println(p3.name + " name");
        p1.age = 34;
        p1.name =  "Laura";

        p2.name = "Dhav";
        System.out.println(p1.name + " " + p1.age);
        System.out.println(p2.name);
        p1.eat();
        p2.eat();
        p1.walk();
        p2.walk();
        p2.walk(38866);
        p1.walk (50);
        

        // Representation of how static keyword can be used
        System.out.println(Person.count);
        // If we change the value of the static variable , then the value will be changed for every person.
        Person.biologicalClass = "Animalia";

        Developer d1 = new Developer(24, "Devarshi");
        System.out.println(d1.name);
        d1.doWork();
        d1.walk(42);
        d1.walk();

        EncapsulationIntro E1 = new EncapsulationIntro();
        // We are able to access this package  here in MainClass.java even though it is defined in another package called encapsulation , because the method is PUBLIC method
        E1.doWorkForEncaps();
        // since hidePassword is a private method it wont be avalable to any other class/package apart from the class in which the method was created.
        // This is how encapsulation is achieved through access modifiers
        // E1.hidePassword();
        // learnEnglish is a default method , hence it is only accessible 
        // E1.learnEnglish();

    }
}
