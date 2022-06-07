package Chapter_2;

public class JavaStatements {
    public void ifElseStatements(){
        int x = 29;
        // basic check
        if (x == 29){
            /*
                code to fire if expression x=29 is true
             */
        }


        //if else statement
        if (true){
            /*
                CODE TO FIRE WHEN EXPRESSION IS TRUE
             */
        } else {
            /*
                CODE TO FIRE WHEN EXPRESSION IS FALSE
             */
        }

        // nested if else statement
        if (x == 29){
            /*
                CODE TO FIRE WHEN EXPRESSION x == 29
             */
        } else if (x > 29){
            /*
                CODE TO FIRE WHEN EXPRESSION x > 29
             */
        } else {
            /*
                CODE TO FIRE WHEN EXPRESSION x is not 29 or > 29
             */
        }

        System.out.println("Ternary operator printing true if x == 29 else false -> " + (x == 29 ? true : false) );


    }
}
