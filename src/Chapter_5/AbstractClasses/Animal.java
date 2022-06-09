package Chapter_5.AbstractClasses;

public abstract class Animal {
    /*
        can have member variables that can be inheritance
        accessible modifiers private public protected default
        can't be instantiated
        can extend a parent class and implements multiple interfaces
        a abstract class's subclass implements all abstract methods unless subclass is also an abstract class where the
        first concrete class needs to implement all abstract classes of all superclasses that it extends

        When?
        share code amoung similar objects
        when you want more access modifiers than just public
        when you want accessible or modifible variables thats not public final static
     */

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    protected abstract void breath();

    public String getName() {
        return name;
    }

    private void doesSomethingSpecial(){
        System.out.println("Animal does something Special");
    }
}
