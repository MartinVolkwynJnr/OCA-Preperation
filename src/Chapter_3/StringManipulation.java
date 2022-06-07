package Chapter_3;

import java.util.Locale;

public class StringManipulation {
    /*
        Creating and Manipulating Strings
        - Concatenation
        - Immutability
        - The String Pool
        - Important String Methods
        - Method Chaining
     */

    public void ConcatenateStrings(){
        String s1 = "12345";

        //Concatenation
        System.out.println("s1 = " + s1);
        s1.concat("6789");
        System.out.println("s1.concat(6789) = " + s1);
        s1 = s1.concat("6789");
        System.out.println("s1 = s1.concat(6789) = " + s1);

        System.out.println(1 + 2);// 3
        System.out.println("a" + "b");// ab
        System.out.println("a" + "b" + 3);// ab3
        System.out.println(1 + 2 + "c");// 3c
    }

    /*
        - Immutability

        String is immutable - not allowed to change!
        immutable object -> an object that can't be change once it's created

        example:
        class Mutable {
            private String s;
            public void setS(String newS){ s = newS }; // setters make a class mutable
            public String getS() {return s;}
        }

        class Immutable {
            private String s;
            public String getS() {return s;}
        }
     */

    /*
        - String pool

        The String pool , also known as the intern pool, is a location in the java virtual machine (JVM) that collects all these strings.
        Strings not in the String pool are garbage collected just like any other object that doesn't have a reference.
     */

    public void ImportantStringMethods(){
        String s1 = "12345";
        String s2 = "martin";
        String s3 = "Hello World";

        // string methods:
        System.out.println(s1.length()); // 5
        System.out.println(s2.charAt(3));// t
        System.out.println(s3.indexOf('l'));// 2
        System.out.println(s1.substring(1,4));//234
        System.out.println(s3.toLowerCase()); // hello world
        System.out.println(s3.toUpperCase()); // HELLO WORLD
        System.out.println(s1.equals("12345")); // true
        System.out.println(s3.equalsIgnoreCase("hello WORLD")); // true
        System.out.println(s2.startsWith("mar")); // true
        System.out.println(s2.endsWith("tin")); // true
        System.out.println(s3.contains(" ")); // true
        System.out.println(s2.replace("martin","michelle")); // michelle
        System.out.println("    Hello World   ".trim().equals(s3));// method chaining and wil return true.
    }
}
