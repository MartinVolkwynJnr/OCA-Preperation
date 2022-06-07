package Chapter_1;

// JavaClassBasics is the CLASS NAME, where a class needs to be in a .java file.
/*
    each a java file can have multiple classes BUT ONLY ONE CLASS CAN BE PUBLIC And it has to have the SAME
    NAME as the .java file name.

 */
public class JavaClassBasics {
    // Fields
    private String fieldHelloWorld = "Hello World!!!";

    // Main Method this starts the actual java program!

    /**
     * The main method of a java class is the entry of the program.
     * @param args
     *
     * the java parameters that the program is started with populates the string array args.
     * this can be read as any other array.
     */
    public static void main(String[] args){
        JavaClassBasics jcb = new JavaClassBasics();
        jcb.printHelloWorld();
    }

    //Methods
    public void printHelloWorld(){

        System.out.println(fieldHelloWorld);
    }

    /*
        Three types of COMMENTS
        1. Inline
        2. Multi-line
        3. JavaDoc multiple-line
     */

    // Inline comment

    /**
     * JavaDoc Comment
     */

    /*
        Multi-line comment
     */
}
