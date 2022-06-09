package Chapter_5;

import Chapter_5.AbstractClasses.Animal;
import Chapter_5.AbstractClasses.Bird;
import Chapter_5.AbstractClasses.Dog;
import Chapter_5.Inheritance.*;
import Chapter_5.Interfaces.ITelephone;
import Chapter_5.Polymorphism.Alligator;
import Chapter_5.Polymorphism.Crocodile;
import Chapter_5.Polymorphism.Reptile;
import Chapter_5.Polymorphism.ZooWorker;
import Chapter_5.RandomObjectsExamples.Mobile;
import Chapter_5.RandomObjectsExamples.OfficePhone;

public class ChapterFiveMain {
    public static void main(String[] args) {
        ChapterFiveMain cfm = new ChapterFiveMain();

//        cfm.InheritanceChecks();
//        cfm.InterfaceChecks();
//        cfm.AbstractChecks();
        cfm.polymorphism();
    }

    private void InheritanceChecks(){
        Vehicle v1 = new Vehicle(); // baseclass
        Car c1 = new Car(); // car extends vehicle
        Nissan carType = new Nissan(); // nissan extends car

        Vehicle v2 = c1; // super class = subclass
        Car c2 = carType; // super class = subclass

        Nissan carType2 = (Nissan) c1;// subclass = (Casting)superclass -> runtime classcast exception
        /*
        Exception in thread "main" java.lang.ClassCastException: Chapter_5.Inheritance.Car cannot be cast to Chapter_5.Inheritance.Nissan
            at Chapter_5.ChapterFiveMain.InheritanceChecks(ChapterFiveMain.java:34)
            at Chapter_5.ChapterFiveMain.main(ChapterFiveMain.java:16)
         */
        //Car c3 = (Car) v1;
        /*
        Exception in thread "main" java.lang.ClassCastException: Chapter_5.Inheritance.Vehicle cannot be cast to Chapter_5.Inheritance.Car
            at Chapter_5.ChapterFiveMain.InheritanceChecks(ChapterFiveMain.java:40)
            at Chapter_5.ChapterFiveMain.main(ChapterFiveMain.java:16)
         */

        A a; // A = baseclass
        B b = new B(); //B extends A
        C c = new C(); //C extends B

        a = b;
        b = c;

        c = (C)b;
        b = (B)a;
    }

    private void InterfaceChecks(){
        ITelephone myPhone;  // Interface ITelephone can be assigned either objects that implement the interface

        //MobilePhone
        myPhone = new Mobile();
        myPhone.callPhone(Mobile.policeNumber);
        Mobile mobilePhone = new Mobile();
        mobilePhone = (Mobile) myPhone; // explicit cast needed to assign implements object type to actual type object

        //OfficePhone
        myPhone = new OfficePhone();
        OfficePhone officePhone = new OfficePhone();
        officePhone = (OfficePhone) myPhone; // explicit cast needed to assign implements object type to actual type object

        // mobilePhone = officePhone; INVALID --> they both only implement interface but have no relation to each other
    }

    private void AbstractChecks() {
        //Animal v1 = new Animal(); // animal is an abstract class and can't be instantiated as object
        Animal a1;
        Dog yorkie = new Dog("Yorkie"); // dog extends animal
        Bird parrot = new Bird("Parrot"); // bird extends animal

        Animal a2 = yorkie;
        Animal a3 = parrot;

        a1 = a2;// VALID both types are of Animal
        a1 = a3;// VALID both types are of Animal

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        boolean result = a2.equals(a3);
        System.out.println("is dog = bird object types Animal = to each other ? " + result);
//        Dog y = parrot; INVALID   DOG != BIRD
//        Bird p = yorkie; INVALID  DOG != BIRD
    }

    private void polymorphism(){
        //One of the most useful applications of polymorphism is the ability to pass instances
        // of a subclass or interface to a method


        /*
            Understanding Polymorphism
            - Object vs. Reference
            - Casting Objects
            - Virtual Methods
            - Polymorphic Parameters
            - Polymorphism and Method Overriding
         */
        /*
            Object vs. Reference
            Object Reference = new object();
            1. Type of the object determines which properties exist whithin the object in memory
            2. type of the reference to the object determines which methods and variables are accessible to the java program


         */

        /*
            Casting objects
            1. Casting an object from a subclass to a superclass doesn't require an explicit cast.
            2. Casting an object from a superclass to a subclass requires an explicit cast.
            3. the compiler will not allow casts to unrelated types
            4. when the code compiles without issue, an exception may be thrown at runtime if
                the object being cast is not actually an instance of that class. (Throws ClassCastException at runtime)
         */
        /*
            Virtual Methods
            - is a method in which the specific implementation is not determined until runtime
            - all non-final, non-static and non-private java methods are considered virtual methods

         */

        //Polymorphism implemented
        ZooWorker.feed(new Alligator()); // subclass alligator of type reptile
        ZooWorker.feed(new Crocodile()); // subclass crocodile of type reptile
        ZooWorker.feed(new Reptile()); // Supper class reptile
        /*
            a subclass can't declare an overridden method with a new or broader exception than in the superclass
            since the method may be accessed using a reference to the superclass.
         */

        /*
                BENEFITS OF POLYMORPHISM
                - makes code more reusable
                - makes code more dynamic [ Dynamic binding]
                - allows the actual decision of which method is to be invoked to be taken at runtime based on the actual class of object


         */

    }
}
