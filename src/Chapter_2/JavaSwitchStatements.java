package Chapter_2;

public class JavaSwitchStatements {
    public void runSwitch(int x){
        /*
                Switch statement can be one of the following :
                byte / Byte
                char / Charachter
                short / Short
                int / Integer
                enum
                string

                the value in the switch case statements has to be compile time constants
                    - only literals, enums constants or final constant variables of the same data types

                NOT SUPPORTED FOR THE SWITCH STATEMENT IS THE double, float and long data types and their wrapper classes
         */
        switch (x){
            case 1: {
                break;
            }
            case 2: break;
            case 3:
                System.out.println("Hello int = 3");break;
            case 4:
                System.out.println("this is going to print 4 and 5 because no break or exists for int = 4");
            case 5:
                System.out.println("5");
            default:
                System.out.println("default int = " + x);break;
        }
    }
}
