package Chapter_6;

//in file Test.java
class E1 extends Exception{ }
class E2 extends E1 { }
class Test{
    public static void main(String[] args){
        try{
            throw new E2();
        }
        catch(E1 e){
            System.out.println("E1");
        }
        catch(Exception e){
            System.out.println("E");
        }
        finally{
            System.out.println("Finally");
        }
        // program output == "E1" "Finally"
        /*
            Since E2 is a sub class of E1, catch(E1 e) will be able to catch exceptions of class E2.
            Therefore, E1 is printed. Once the exception is caught the rest of the catch blocks at
            the same level (that is the ones associated with the same try block) are ignored.
            So E is not printed. finally is always executed (except in case of System.exit()),
             so Finally is also printed.
         */
    }


    /*


Question - Consider the following code...

class MyException extends Exception {}

public class TestClass{
     public void myMethod() throws XXXX{
         throw new MyException();
     }
}

What can replace XXXX?

xxxx-> MyException/Exception/throwbale    --not runtimeexception because it doesn't cover myexception

    You can use Throwable as well as Exception as both of them are super classes of MyException.
    RuntimeException (and its subclasses such as NullPointerException and ArrayIndexOutOfBoundsException) is not a checked exception.
    So it cannot cover for MyException which is a checked exception.
    You cannot use Error as well because it is not in the hierarchy of MyException, which is Object <- Throwable <- Exception <- MyException.

     */
}