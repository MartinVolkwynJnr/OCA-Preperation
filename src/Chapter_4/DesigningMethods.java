package Chapter_4;

public class DesigningMethods {
    /*
    Designing Methods
    - Optional Specifiers
    - Return Type
    - Method Name
    - Parameter List
    - Optional Exception List
    - Method Body
     */

    //Method Signature:
    public final void nap(int minutes) throws InterruptedException{
        // take a nap

        /*
            Element             Value in nap() example          Required?
            Access modifier     public                          No
            Optional specifier  final                           No
            Return type         void                            Yes
            Method name         nap                             Yes
            Parameter list      (int minutes)                   Yes, but can be empty parentheses
            Optional exception  throws InterruptedException     No
                       list

            Method body         {                               Yes, but can be empty braces
                                    // take a nap
                                }

         */

    }
}
