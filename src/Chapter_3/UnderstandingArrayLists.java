package Chapter_3;

import Chapter_5.Inheritance.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnderstandingArrayLists {
    /*
        Understanding an ArrayList
        - Creating an ArrayList
        - Using an ArrayList
        - Wrapper Classes
        - Autoboxing
        - Converting Between array and List
        - Sorting
     */

    /*
            NOTES:
            1. import java.util.*; // OR
                import java.util.ArrayList;

            2. ArrayLists can change size at runtime as needed

            3. ArrayList is an ordered sequence that allows duplicates
     */

    public void creatingArrayLists(){
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);

        ArrayList<String> list4 = new ArrayList<>();
        ArrayList<String> list5 = new ArrayList<String>();

        List<String> list6 = new ArrayList<>(); //List is superclass of ArrayList
        //ArrayList<String> list7 = new List<>(); // DOESN"T COMPILE


    }

    public void usingArrayLists(){
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("Martin");
        list1.add("Michelle");
        list1.add(0,"Logan");
        list1.add("Zaan");



        list1.remove("Zaan");
        list1.remove(0);

        list1.set(0,"MartinV"); //update element at index possition

        list1.isEmpty();// true / false if it has elements
        list1.size(); // how many items in the list

        list1.clear(); // easy way to discard all elements of the ArrayList

        list1.add("Martin");
        list1.add("Michelle");
        list1.add(0,"Logan");
        list2.add("Martin");
        list2.add("Michelle");
        list2.add(0,"Logan");


        list1.contains("Logan"); // true / false if element exists

        list1.equals(list2); // true/false ArrayList has custom equals method to compare if elements in the same order etc.
    }

    public void WrapperClasses(){

        // WRAPPER CLASSES is an object type that corresponds to the primitive
        // when typing the primitive java autoboxes it to the relative Wrapper class needed and vise versa
        /*
                Wrapper classes
                Primitive type                  Wrapper class                   Example of constructing
                boolean                         Boolean                         new Boolean(true)
                byte                            Byte                            new Byte((byte) 1)
                short                           Short                           new Short((short) 1)
                int                             Integer                         new Integer(1)
                long                            Long                            new Long(1)
                float                           Float                           new Float(1.0)
                double                          Double                          new Double(1.0)
                char                            Character                       new Character('c')
         */

        /*
                Equals method of a primitive wrapper class ( e.g. java.lang.Integer, Double, Float etc) are
                1. symmetric => a.equals(b) returns same as b.equals(a)
                2. transitive => if a.equals(b) and b.equals(c) return true, then a.equals(c) returns true.
                3. reflexive => a.equals(a) return true.

                For example, the following code for the equals method on Integer explains how it works:
                public boolean equals(Object obj) {
                   if (obj instanceof Integer) {
                       return value == ((Integer)obj).intValue();
                   }
                   return false;
                }
         */

        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf(123);

        System.out.println("primitive = " + primitive + " wrapper = " + wrapper);
        System.out.println("primitive = wrapper = " + (wrapper == primitive));

        /*
            Wrapper class   String to primitive             String to wrapper class
            Boolean         Boolean.parseBoolean("true");   Boolean.valueOf("TRUE");
            Byte            Byte.parseByte("1");            Byte.valueOf("2");
            Short           Short.parseShort("1");          Short.valueOf("2");
            Integer         Integer.parseInt("1");          Integer.valueOf("2");
            Long            Long.parseLong("1");            Long.valueOf("2");
            Float           Float.parseFloat("1");          Float.valueOf("2.2");
            Double          Double.parseDouble("1");        Double.valueOf("2.2");
            Character       None                            None
         */
    }

    public void autoBoxing(){
        List<Double> weights = new ArrayList<>();
        weights.add(50.5);                  //[50.5]
        weights.add(new Double(60));  //[50.5, 60]
        weights.remove(50.5);            //[60]
        double first = weights.get(0);      //60.0

        //unboxing a null gives nullpointer exception
    }

    public void convertingArrayAndLists(){
        List<String> list = new ArrayList();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        System.out.println("ObjectArray.length = " + objectArray.length);
        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length);
    }


    public void sortingArrayLists(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        System.out.println(numbers); //[99, 5,81]
        Collections.sort(numbers);
        System.out.println(numbers); //[5,81,99]
    }
}
