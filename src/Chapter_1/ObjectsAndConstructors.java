package Chapter_1;

import javax.sound.midi.Soundbank;

public class ObjectsAndConstructors {
    /*
            ORDER OF INITIALIZATION
            1. Fields and instance initializer blocks are run in the order they appear in the file.
            2. Constructor runs after all fields and instance initializer blocks have run

            further detail in later chapters
     */


    public static String name = "michelle";
    public int age =  18; // inline initialization

    // initializer blocks these are run to initialize class variables static or instance
    {
        name = "martin";
        System.out.println("name");

    }

    //  no-args constructor
    public ObjectsAndConstructors() {
        this("Michelle");
    }

    /*
        class can have mulitple overloaded constructors (MORE DETAIL in Chapter 4/5)
        a constructor have no return type
        usually used for initialization of class fields
     */
    public ObjectsAndConstructors(String name){
        this.name = name; // constructor initialization
    }

    public static void main(String[] args) {
        System.out.println("Running the main method");

        ObjectsAndConstructors oAndC = new ObjectsAndConstructors();
        oAndC.name = "martinV2"; // set variable/field
        // you can't reference a variable before it has been initialized

        System.out.println("here lies " + oAndC.name); // reading of the object variable
    }
}
