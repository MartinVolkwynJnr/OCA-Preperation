package Chapter_6.TestMethodRead;

public class TestClass {
    public static void main(String[] args) {
        A a = new B();
        ((B)a).m(); // Due to explicit casting of 'a' to B, the compiler knows that  'a'will point to an object of class
        // B (or its subclass), whose method m() does not throw an exception. so ther is no need for a try catch block here
    }
}
