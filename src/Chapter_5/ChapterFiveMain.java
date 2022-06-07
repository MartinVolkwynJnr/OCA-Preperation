package Chapter_5;

import Chapter_5.AbstractClasses.Animal;
import Chapter_5.AbstractClasses.Bird;
import Chapter_5.AbstractClasses.Dog;
import Chapter_5.DateFormats.DateFormatting;
import Chapter_5.Inheritance.*;
import Chapter_5.Interfaces.ITelephone;
import Chapter_5.RandomObjectsExamples.Mobile;
import Chapter_5.RandomObjectsExamples.OfficePhone;

public class ChapterFiveMain {
    public static void main(String[] args) {
        ChapterFiveMain cfm = new ChapterFiveMain();

        cfm.InheritanceChecks();
        cfm.InterfaceChecks();
        cfm.AbstractChecks();
        cfm.polimorphism();

        //DatesFormatting
        DateFormatting.printStringDates();
        DateFormatting.printCustomDates();
        DateFormatting.printLocalDates();
    }

    private void InheritanceChecks(){
        Vehicle v1 = new Vehicle(); // baseclass
        Car c1 = new Car(); // car extends vehicle
        Nissan carType = new Nissan(); // nissan extends car

        Vehicle v2 = c1;
        Car c2 = carType;

//        Nissan carType2 = (Nissan) c1;
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

    private void polimorphism(){
        //TODO: martin
    }
}
