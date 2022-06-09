package Chapter_4;

public class AccessModifiers {
    /*
    Applying Access Modifiers
    - Private Access
    - Default (Package Private) Access
    - Protected Access
    - Public Access
    - Designing Static Methods and Fields
    - Calling a Static Variable or Method   == being done in chapter[i]Main classes for static and instance objects
    - Static vs. Instance
    - Static Variables
    - Static Initialization
    - Static Imports
     */

    /*
            Static initializations on create it is initialized or with a static block
            static imports example import java.util.ArrayList;
     */

    public static String martinName = "Martin"; // Static variable and initialized
    public static String michelleName;
    static{
        michelleName = "Michelle"; // static variable initialized in static block
    }

    public static void printStaticMethod(){ // static method
        System.out.println("static method called via ClassName");
    }

    public void printInstanceMethod(){
        System.out.println("instance method called via instance object of the class");
    }

    /*
        CALLING static vs instance

        Type Calling            Legal?                                  How?

        Static method           Another static method or variable       Yes Using the classname
        Static method           An instance method or variable          No
        Instance method         A static method or variable             Yes Using the classname or a reference variable
        Instance method         Another instance method or variable     Yes Using a reference variable
     */


    /*
        ACCESS MODIFIERS

            public      -> called from any class

            private     -> called from within the same class

            protected   -> called from within the same package or subclasses

            default     -> no keyword default just omit the access modifier -> only accessible from classes in the same package


            Can access                  If that member      If that member          If that member      If that member
                                        is private?         has default (package    is protected?       is public?
                                                            private) access?

            Member in the same class    Yes                 Yes                     Yes                 Yes

            Member in another class     No                  Yes                     Yes                 Yes
            in same package

            Member in a superclass in   No                  No                      Yes                 Yes
             a different package

            Method/field in a non-      No                  No                      No                  Yes
            superclass class in a
             different package


         */


}
