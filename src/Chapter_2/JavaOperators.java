package Chapter_2;

public class JavaOperators {
    /*
            TABLE 2.1           Order of operator precedence
            Operator                                    Symbols and examples
            Post-unary operators                        expression++, expression--
            Pre-unary operators                         ++expression, --expression
            Other unary operators                       +, -, !
            Multiplication/Division/Modulus             *, /, %
            Addition/Subtraction                        +, -
            Shift operators                             <<, >>, >>>
            Relational operators                        <, >, <=, >=, instanceof
            Equal to/not equal to                       ==, !=
            Logical operators                           &, ^, |
            Short-circuit logical operators             &&, ||
            Ternary operators                           boolean expression ? expression1 : expression2
            Assignment operators                        =, +=, -=, *=, /=, %=, &=, ^=, !=, <<=, >>=, >>>=


     */


    public void printOperatorExamples(){
        int x = 3;
        int y = 2;
        int z = 4;

        String name = "Martin";
        String surname = "Volkwyn";

        System.out.println("x, y , z, -> "+ x + y + z);
        System.out.println(name + " " + surname);

        System.out.println("General");
        System.out.println("x times y = " + (x * y));
        System.out.println("z devided y = " + (z / y));
        System.out.println("x modulus y = " + (x % y));

        System.out.println("modulus examples: ");
        System.out.println("10/3 -> " + (10/3));
        System.out.println("10%3 -> " + (10%3));
        System.out.println("12/3 -> " + (12/3));
        System.out.println("12%3 -> " + (12%3));

        System.out.println("logical complement and negation operators");
        boolean bool = false;
        System.out.println("bool value =" + bool);
        System.out.println("!bool value = " + !bool);
        System.out.println("x value = " + x);
        System.out.println("-x value = " + -x);

        System.out.println("y value = " + y);
        System.out.println("++y value = " + ++y);
        System.out.println("x value = " + x);
        System.out.println("x++ value = " + x++);


        System.out.println("y value = " + y);
        System.out.println("--y value = " + --y);
        System.out.println("x value = " + x);
        System.out.println("x-- value = " + x--);

    }

    public void casting(){
        short s1 = 3;
        short s2 = 4;
        short s3 = (short)(s1 + s2);
        int s1Ands2Result = s1 + s2;

        double d1 = 2.3;
        float f1 = 3.4f;
        double dResult = d1 + f1;

        int i1 = (int) 3.4;
        float result = (float) (d1 + f1);
    }

    public void logicalOperators(){
        // the & and the | and ^ operator checks both true values and run the code either
        System.out.println("true & true = " + (true & true));
        System.out.println("false & false = " + (false & false));
        System.out.println("false & true = " + (false & true));
        System.out.println("true & false = " + (true & false));

        System.out.println("true | true = " + (true | true));
        System.out.println("false | false = " + (false | false));
        System.out.println("false | true = " + (false | true));
        System.out.println("true | false = " + (true | false));

        System.out.println("true ^ true = " + (true ^ true));
        System.out.println("false ^ false = " + (false ^ false));
        System.out.println("false ^ true = " + (false ^ true));
        System.out.println("true ^ false = " + (true ^ false));

        // the && and the || checks left first and if that isn't true then runs next right boolean check until it gets true
        System.out.println("true || true = " + (true || true));
        System.out.println("false || false = " + (false || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("true || false = " + (true || false));

        System.out.println("true && true = " + (true && true));
        System.out.println("false && false = " + (false && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("true && false = " + (true && false));
    }
}


/*
        NOTES:

        Numeric propomtion:
        if two values have different data types one is promoted to the larger of the two data types:
        if a int and a float is added they will be promoted to float and result wil be float.
        the result is the same data type as the promoted type.
        byte short and char are first promoted to int even if no int is in the equation


 */
