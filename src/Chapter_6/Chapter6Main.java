package Chapter_6;


public class Chapter6Main {
    public static void main(String[] args) {
        /*
            Understanding Exceptions

            Using a try Statement

            Recognizing Common Exception Types

            Calling Methods That Throw Exceptions
         */

        Chapter6Main c6 = new Chapter6Main();
        //calling methods that throws exception
        try {
            c6.fall();
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    /*
        Understanding Exceptions

        Exception Tyes:

        java.lang.Object -> java.lang.Throwable -> java.lang.Exception -> java.lang.RuntimeException
                                                -> java.lang.Error


        java.lang.Error
        - means something went horibly wrong and your program should not attempt to recover from it

        java.lang.RuntimeException
        - is defined as teh RuntimeException class and its subclasses.
        - Runtime exceptions tend to be unexpected but not necessarily fatal.
        - UNCHECKED Exceptions (JVM can compile)
        - example and ArrayIndexOutOfBounds Exception

        java.lang.Exception
        - checked exceptions includes exception and all subclasses that do not extend RuntimeException
        - checked exceptions tend to be more anticipated
        - example is trying to read a file that doesn't exist.
        - Java requires a checked exception to be handled or declare Rule.
        - example below

        Type                How to recognize        Okay for program to catch?      Is program required to handle or declare?

        Runtime exception   Subclass of             Yes                             No
        RuntimeException

        Checked exception   Subclass of Exception   Yes                             Yes
        but not subclass of
        RuntimeException

        Error               Subclass of Error       No                              No
     */
    void fall() throws Exception{ // throws -> tells java that this method throws an <Exception>

        String result = "";
        String v = null;
        try {
            try{
                result += "before ";
                v.length();
                result += "after ";

            }catch (NullPointerException nullPointerException){
                result += "Catch";
                System.out.println("Nullpointer method");
                throw new RuntimeException();
            }finally {
                result += "finally ";
                throw new Exception();
            }

        }catch (Exception exception){
            result += "done";
            System.out.println("Exception method");
        }finally {
            System.out.println(result);
            System.out.println("Finally method");
        }

        throw new Exception(); // throw -> tells java that you want to throw an exception
    }

    /*
            COMMON Exceptions for the OCA exam

            RUNTIME EXCEPTIONS!!

            0. ArithmeticException Thrown by the JVM when code attempts to divide by zero

            1. ArrayIndexOutOfBoundsException Thrown by the JVM when code uses an illegal
                            index to access an array

            2. ClassCastException Thrown by the JVM when an attempt is made to cast an exception
                            to a subclass of which it is not an instance
            3. IllegalArgumentException Thrown by the programmer to indicate that a method has
                            been passed an illegal or inappropriate argument
            4. NullPointerException Thrown by the JVM when there is a null reference where an
                            object is required
            5. NumberFormatException Thrown by the programmer when an attempt is made to convert
                            a string to a numeric type but the string doesn’t have an appropriate format


            CHECKED Exceptions!!

            a. FileNotFoundException Thrown programmatically when code tries to reference a file
                            that does not exist
            b. IOException Thrown programmatically when there’s a problem reading or writing a file


            Errors!!

            1. ExceptionInInitializerError Thrown by the JVM when a static initializer throws
                            an exception and doesn’t handle it
            2. StackOverflowError Thrown by the JVM when a method calls itself too many times
                            (this is called infi nite recursion because the method typically calls itself without end)
            3. NoClassDefFoundError Thrown by the JVM when a class that the code uses is available
                            at compile time but not runtime

     */

    /*
        Printing of exceptions

        5: public static void main(String[] args) {
        6: try {
        7: hop();
        8: } catch (Exception e) {
        9: System.out.println(e);                   // 1
        10: System.out.println(e.getMessage());     // 2
        11: e.printStackTrace();                    // 3
        12: }
        13: }
        14: private static void hop() {
        15: throw new RuntimeException("cannot hop");
        16: }

        This code results in the following output:

        1. java.lang.RuntimeException: cannot hop

        2. cannot hop

        3. java.lang.RuntimeException: cannot hop
            at trycatch.Handling.hop(Handling.java:15)
            at trycatch.Handling.main(Handling.java:7)
     */
}
