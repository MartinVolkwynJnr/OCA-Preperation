package Chapter_4;

public class Chapter4Main {
    /*
        Designing Methods

        Working with Varargs

        Applying Access Modifiers

        Passing Data Among Methods

        Overloading Methods

        Creating Constructors

        Encapsulating Data

        Writing Simple Lambdas
     */

    public static void main(String[] args) {
        Chapter4Main c4 = new Chapter4Main();
        c4.lambdaExpressions();
    }

    // working with varargs
    public void walk1(int... nums){
        for (int i : nums){
            System.out.println(i);
        }
    }
    public void walk2(int start, int... nums){}
    //public void walk3(int... nums, int start){} // compile issue - varagrs can only be the last parameter in the method parameter list



    private void lambdaExpressions() {

    }

    private void DesigningMethods(){

    }
}

