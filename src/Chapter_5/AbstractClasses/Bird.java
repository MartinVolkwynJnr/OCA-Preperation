package Chapter_5.AbstractClasses;

import Chapter_5.Interfaces.CanFly;

public class Bird extends Animal implements CanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "is Pecking");
    }

    @Override
    public void breath() {
        System.out.println(getName() + " is breathing");
    }

    @Override
    public void canFly() {
        System.out.println(getName() + "can actually fly");
    }
}
