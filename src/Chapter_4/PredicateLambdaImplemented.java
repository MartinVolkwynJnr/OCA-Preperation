package Chapter_4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class PredicateLambdaImplemented {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(); // list of animals
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        // replace line-x with following line to make use of lambda
        print(animals, a -> a.canHop()); // lambda expression ==>  "a -> a.canHop()"
        print(animals, (a) -> a.canHop()); // lambda expression ==>  "a -> a.canHop()"
        print(animals, (a) -> {return a.canHop();});
        print(animals, (Animal a) -> {return a.canHop();}); // full lambda whats happening can omit return{} and type specification that is infered by java


        // ArrayList method you can use it too

        animals.removeIf(a -> a.canHop());
    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) // the general check
                System.out.print(animal + " ");
        }
        System.out.println();
    }

}
