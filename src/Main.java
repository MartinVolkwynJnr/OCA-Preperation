import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {
    public static Integer wiggler(Integer x){
        Integer y = x + 10;
        x++;
        System.out.println(x);
        return y;
    }

    public static void main(String[] args){
        Integer dataWrapper = new Integer(5);
        Integer value = wiggler(dataWrapper);
        System.out.println(dataWrapper+value);
    }


//    public static void main(String[] arguments) {
//        System.out.println("Hello world!");
//        System.out.println("Martin Volkwyn OCA Preperation");
//
//        Main mainObject = new Main();
//    }
}