package Chapter_1;

public class Variables {
    /*
        Instance Variables are variables thats not local and are defined within the class

        like these below

        DEFAULT initialization for instance and class variables only

        boolean                                     false
        byte,short,int,long                         0
        float,double                                0.0
        char                                        ''
        all object references (everything else)     null
     */


    //Container blocks
    // code blocks are blocks of code surounded in {}

    /*
        RULES OF SCOPE
        1. local variables - in scope from declarations to end of block
        2. instance variables - in scope from declaration until object garbage collected
        3. class variables - in scope from declaration until program ends


     */
    {
        // instance variables can be initialized in an instancebl
    }

    /*
        multiple variables in one line
     */

    // creates 4 string variables referencing NULL object
    public String s1,s2,s3,s4;

    // declared multiple variables with different string values all in one line, generally not good practice.
    public String s5 = "test1",s6 = "test2",s7 = "test3",s8 = "test4";

    // Catch question, only the i3 is given value 3;
    public int i1,i2,i3 = 3;

    // int i2, String s2; does not compile for multiple line variables the same type needs to be shared.


    //Identifiers

    //3 Rules for naming of fields/variables/identifiers.
    /*
        1. name must begin with a letter or symbol $ or _
        2. Subsequent characters may also be numbers
        3. Cannot use the same name as a java reserved word.

        be aware the following are VALID


        okidentifier
        $OK2Identifier
        _alsoOk1d3ntifi3r
        __SStillOkbutKnotsonice$




     */

    /*
        JAVA RESERVED WORDS


        abstract    assert  boolean break   byte
        case    catch   char    class   const
        continue    default do double   else
        enum    extends false   final   finally
        float   for goto    if  implements
        import  instanceof  int interface   long
        native  new     null    package private
        protected   public  return  short   static
        strictfp    super   switch  synchronized    this
        throw   throws  transient   true    try
        void    volatile while


     */


    public static void main(String[] args) {
        String localVariable = "local Variable";
        /*
            local variables :
                - must be initialized before use
                - do not have a default value and contain garbage data until initialized.
         */
    }

    /*
        GARBAGE Collection
        - the process of automatically freeing memory on the heap by deleting objects that are
            no longer reachable in your program
        - System.gc() is not guaranteed to run
            + this method java provides merely suggests that now might be a good time for java to kick of GC.
                java can ignore this suggestion
        - A object is ready for GC when its is no longer reachable by the program in two situations
            + the object no longer has any references pointing to it
            + all reference to the object have gone out of scope.
        - it is the object that gets GC not the reference

        ++ CHECK TEXT BOOK for diagram explaining how to show or calc when an object is ready to be GC.

     */

    /*
        finalize()

        java allows objects to implement a method called finalize() that might get called.
        - gets called if the Garbage collector tries to collect the object
        - if garbage collector doesn't run this method doesn't run
        - will never be called twice!!

        
     */
}
/*
    Benefits of JAVA

    1. Object Oriented
    2. Encapsulation
    3. Platform independent
    4. Robust
    5. Simple
    6. Secure
 */