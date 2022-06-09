package Chapter_3;

public class EqualityMethodUnderstanding {
    /*
        string.equals();

        vs.

        string == string...
        obj == obj
     */

    public void understandingEquality(){
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one == two);  // false
        System.out.println(one == three);// true

        String x = "Hello World";
        String y = "Hello World";

        System.out.println(x==y); // true
        String a = "Hello";
        String b = " Hello  ".trim();

        System.out.println(a == b); // false litterals is not pointing to same object

        String c = new String("Hello World");
        String d = "Hello World";

        System.out.println(c == d );// false -> c is explicit new object in the string pool thus not pointing to same object string

        // StringBuilder has no implemented equals method thus if one.equals(three) it will compare object references
        System.out.println(x.equals(y));//true same text value
        System.out.println(a.equals(b));//true same text results
    }
}
