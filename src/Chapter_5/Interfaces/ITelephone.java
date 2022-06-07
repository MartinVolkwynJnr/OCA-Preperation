package Chapter_5.Interfaces;

public interface ITelephone {
    /*
     * Interfaces and indicate what methods should be implemented by a class and
     * additionally create static final variables default methods
     */

    /*

        accessible modifiers public
        can't be instantiated

        When?
        you expect that unrelated classes will implement your interface
        you want to specify the behavior of a particular data type, but you are not concerned about who implements its behavior
        you want to separate different behavior


     */

    int policeNumber = 112; // -> public final static int policeNumber = 112;

    default void powerOn(){
        System.out.println("defaultPowerOn");
    };
    abstract void dial(int phoneNumber);

    static void answer(){
        System.out.println("static void answer");
    };
    boolean callPhone(int phoneNumber);
    boolean IsRinging();
}
