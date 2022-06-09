package Chapter_5.Interfaces;

public interface CanFly {
    int value = 0;
    /*
        As a rule, fields defined in an interface are public, static, and final. The methods are public.
        Here, the interface IInt defines thevalue and thus any class that implements this interface gets
        this field. Therefore, it can be accessed using s.thevalue or just thevalue inside the class.
        Also, since it is static, it can also be accessed using IInt.thevalue or Sample.thevalue.
     */
    void canFly();
}
