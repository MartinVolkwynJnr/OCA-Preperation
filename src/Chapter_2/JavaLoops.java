package Chapter_2;

import java.util.Arrays;
import java.util.List;

public class JavaLoops {
    /*
            while loops
            for loop and enhanced for loops
            do/while loops
            compare loop constructs
            use of break and continue
         */
    public void whileLoop(){
        boolean whileBool = true;
        int x = 0;
        // while block runs only if conditional expression is true
        while(whileBool){
            x++;
            if(x == 5)
                whileBool = false;
        }
    }

    public void forLoop(){
        //for (count variable; condition; incremental/ decremental sequence)
        for(int i = 0; i >= 10; i++){
            if (i == 5)
                break;
        }

        //multiple variables are valid
        for(int i = 0, j = 10; i > j; i++, j--){
            if (i == j)
                break;
        }

//      THIS IS A VALID LOOP BUT ITS INFINITE LOOP!!!
//        for(; ;){
//
//        }
        int counter = 0;
        infinite: for(; ;){
            ++counter;
            if (counter > 5){
                break infinite; // break statement jumps out of the current loop or to the pointed label
            }else {
                continue; // continue just skips the rest of the code in the loop and continue with the next sequence in the loop
            }
        }
    }

    public void enhancedForLoop(){
        /*
            for (datatype instance : collection){
                //code
            }
         */
        String[] names = new String[]{"martin", "michelle", "logan"};
        for (String name : names){
            System.out.println("name = " + name);
        }
    }

    public void doWhileLoop() {
        boolean whileBool = true;
        int x = 0;
        // do block runs always at least once and then checks while condition
        do {
            x++;
            if(x == 5)
                whileBool = false;
        }while(whileBool);
    }
}
