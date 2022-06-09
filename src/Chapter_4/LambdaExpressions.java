package Chapter_4;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressions {
    /*
    Writing Simple Lambdas
    - Lambda Example
    - Lambda Syntax
    - Predicates
     */

    /*
            LAMBDAS work with interfaces that have only ONE method.(FUNCTIONAL INTERFACES)

            Thus java provides an interface to cater for this so that you don't need to creat an interface for each lambda used

            Predicates -> java.util.function
                public interfaces Predicate<T> {
                    boolean test (T t);
                }
     */

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>(); // list of animals
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        // line-x to replace with lambda
        print(animals, new CheckIfHopper()); // pass class that does check

        // replace line-x with following line to make use of lambda
        print(animals, a -> a.canHop()); // lambda expression ==>  "a -> a.canHop()"
        print(animals, (a) -> a.canHop()); // lambda expression ==>  "a -> a.canHop()"
        print(animals, (a) -> {return a.canHop();});
        print(animals, (Animal a) -> {return a.canHop();}); // full lambda whats happening can omit return{} and type specification that is infered by java

        //Valid lambdas if interfaces exist for them:
       /*

        //Valid lambdas if interfaces exist for them:
//        print(animals, () -> true);// 0 parameters;
//        print(animals, a -> a.("test"));
//        print(animals, (String a) -> a.startsWith("test"));
//        print(animals, (a,b) -> a.startsWith(b));
//        print(animals, (String a, String b) -> a.startsWith(b));


        */

    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) // the general check
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}

class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a){
        return a.canHop();
    }
}

class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String species, boolean canHop, boolean canSwim) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return species;
    }
}

interface CheckTrait {
    boolean test(Animal a);
}

