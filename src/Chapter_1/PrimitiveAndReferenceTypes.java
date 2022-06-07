package Chapter_1;

public class PrimitiveAndReferenceTypes {
    // Reference type -> a field that has a type-of an object
    private String name;




    // PRIMITIVE TYPES !!
    private byte byteValue = 13;                                // 8-bit   values [ -128 -> 127 ]
    private short shortValue = 32;                              // 16-bit integer value
    private int intValue = 123;                                 // 32-bit integer value [2_147_483_647]
    private long longValue = 32432L;                            // 64-bit integer value
    private float floatValue = 4.34f;                           // 32-bit floating-point value
    private double doubleValue = 32.42; // explicit 32.42d      // 64-bit floating-point value
    private char charValue = 'a';                               // 16-bit Unicode value
    private boolean boolValue = false;                          // true / false


    /*
    int valid values with _ in between value;
     */
    public int underScoreInt = 1_999_324;

    public double underScoreDouble = 3_234.0_3; // valid same as 3234.03

    /*
        invalid double values with INVALID USE OF _

        _1000.00
        3200_.00
        3300.00_

        These does NOT COMPILE
     */

    public int withoutUnderScore = 1999324;

    public static void main(String[] args) {
        PrimitiveAndReferenceTypes pAndR = new PrimitiveAndReferenceTypes();

        if (pAndR.underScoreInt == pAndR.withoutUnderScore)
            System.out.println("Two int values are the same");
    }
    /*
        VALID digits in several other formats:
        - OCTAL (digits 0-7), which uses the number 0 as a prefix -- for example 017
        - hexadecimal (digits 0-9 and letters A-F)
        - binary (digits 0/1)

     */

    //////////////////////////////////////////////////////////////////

    //Reference Types

    /*
        - a reference can be assigned to another object of the same type
        - a reference can be assigned to a new object using the new keyword

        A Reference type refers to an object (an instance of a class).
        A reference "points" to an object by storing the memory address where the object is located, a consept refeerred to as a pointer.


     */

    //////////////////////////////////////////////////////////////


    // KEY DIFFERENCES

    /*
        1. Reference types can be assigned NULL, (currently not referencing an object in memory)
        2. Primitive types will give you compiler error if you attempt to assign them null.
        3. Reference types can be used to call methods when they do not point to null.
        4. Primitives do not have methods declared on them they are just a value.
        5. Primitives types have lowercase type names. All classes that come with Java begin with uppercase.
     */






}
