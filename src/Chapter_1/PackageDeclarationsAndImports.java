// package name where the java file is being stored. and the package name needs to be first in the class declaration
package Chapter_1;

// if the java file has a package name then the imports can only be inserted after the package name
import java.util.Random;

/*
 this is valid and called a wildcard, in this scenario it will be redundant because
 we already have a specified Random import statement where this wildcard imports all the sub-objects in the util package
 */
import java.util.*;

// redundant import because java imports it by default is the following
import java.lang.System;
import java.lang.*;

/*
    IMPORTANT : You can NOT import 2 classes with the same name! even if they are from different packages
    Example if you want to import Date then you need only one import either from SQL or the Util Date.

    if you MUST use both versions of the DATE classes you can either point directly to that package class when
    using the statement for example if i have imported java.util; and i need to use the sql import i will need to
    use the correct package name as prefix to the date object declaration example:

    java.util.Date date = new java.util.Date();
    java.sql.Date dateSql = new java.sql.Date();
 */

public class PackageDeclarationsAndImports {


    public static void main(String[] args) {
        Random r = new Random(); // Random object IMPORTED from the java.util.Random package
        System.out.println(r.nextInt(10)); // prints the next random int value from 0 - 9
    }
}
