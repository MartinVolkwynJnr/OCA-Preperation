package Chapter_3;

public class UsingOfStringBuilder {
    /*
        Using the StringBuilder Class
        - Mutability and Chaining
        - Creating a StringBuilder
        - Important StringBuilder Methods
        - StringBuilder vs. StringBuffer
     */

    /*
            StringBuilder vs. StringBuffer
            StringBuffer does the same as StringBuilder but slower and StringBuffer is threadsafe
     */
    public void creatingStringBuilder(){
        // StringBuilder = mutable / changeable
        StringBuilder sb = new StringBuilder("1234");
        sb.append("5")
            .append("6")
            .append("7")
            .append("8"); // method chaining;

        String stringBuilderString = sb.toString();
        System.out.println(stringBuilderString);
    }

    public void ImportantStringBuilderMethods(){
        StringBuilder sb = new StringBuilder("1234");
        sb.charAt(2);
        sb.indexOf("3");
        sb.length();
        sb.substring(0,3);
        sb.append("abc");
        sb.append("3232",0,4);
        sb.insert(0,"cde");
        sb.delete(3,5);
        sb.deleteCharAt(4);
        sb.reverse();
        sb.replace(0,3,"321");
        System.out.println(sb.toString());
    }

}
