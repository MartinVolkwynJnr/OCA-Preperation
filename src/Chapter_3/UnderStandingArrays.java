package Chapter_3;

import Chapter_5.AbstractClasses.Dog;

import java.util.*;

public class UnderStandingArrays {
    /*
        Understanding Java Arrays
        - Creating an Array of Primitives
        - Creating an Array with Reference Variables
        - Using an Array
        - Sorting
        - Searching
        - Varargs
        - Multidimensional Arrays
     */

    public static void main(String[] args) {
        // var args = array object
        if (args.length > 0){
            for (String arg : args){
                System.out.println(arg);
            }
        }
        else {
            System.out.println("No args was provided");
        }
    }

    public void createArraysOfPrimitives(){

        // ALL Primitive TYPE ARRAY ELEMENTS GETS A DEFAULT VALUE OF associated default values!!

        //valid syntax but not so liked but used in exam:
        int i4[];
        int [] i3;
        int[] i2 = {32, 23,42}; // this is an anonymous array because you don't assign type or size

        // Standard way of creating arrays:
        byte[] bt1 = new byte[3];       // 0
        char[] c1 = new char[4];        // 0
        short[] s1 = new short[4];      // 0
        int[] i1 = new int[3];          // 0
        long[] l1 = new long[5];        // 0
        double[] d1 = new double[4];    // 0.0
        float[] f1 = new float[4];      // 0.0
        boolean[] b1 = new boolean[5];  // false

        for (int i = 0; i < bt1.length; i++){System.out.println("byte[" + i + "] array value = " + bt1[i]);}
        for (int i = 0; i < c1.length; i++){System.out.println("char[" + i + "] array value = " + c1[i]);}
        for (int i = 0; i < s1.length; i++){System.out.println("short[" + i + "] array value = " + s1[i]);}
        for (int i = 0; i < i1.length; i++){System.out.println("int[" + i + "] array value = " + i1[i]);}
        for (int i = 0; i < l1.length; i++){System.out.println("long[" + i + "] array value = " + l1[i]);}
        for (int i = 0; i < d1.length; i++){System.out.println("double[" + i + "] array value = " + d1[i]);}
        for (int i = 0; i < f1.length; i++){System.out.println("float[" + i + "] array value = " + f1[i]);}
        for (int i = 0; i < b1.length; i++){System.out.println("boolean[" + i + "] array value = " + b1[i]);}

        System.out.println("-------------- end of primitive arrays ------------");
    }

    public void createArraysOfReferenceVariables(){
        // ALL REFERENCE TYPE ARRAY ELEMENTS GETS A DEFAULT VALUE OF NULL!!

        String[] s1 = new String[4]; // string type is an object reference type
        Dog[] d1 = new Dog[5]; // an actual user object class Dog.

        int counter = 0;
        for (String s : s1){
            System.out.println("String[" + counter + "] array value = " + s);
            counter++;
        }
        counter = 0;
        for (Dog d : d1){
            System.out.println("Dog[" + counter + "] array value = " + d);
            counter++;
        }
    }

    public void usingArrays(){
        String[] s1 = new String[5];
        System.out.println("s1 array length = " + s1.length);
        System.out.println("s1[index = 0]  = " + s1[0]);
        System.out.println("adding values to each element of the array with s1[i] = value");
        s1[0] = "one";
        s1[1] = "two";
        s1[2] = "three";
        s1[3] = "four";
        s1[4] = "five";
        for (String s : s1){
            System.out.println(s);
        }
        System.out.println("or use plain forloop to be able to use the i counting variable:");
        for (int i = 0; i < s1.length; i++){System.out.println("String[" + i + "] array value = " + s1[i]);}
    }

    public void sortingOfArrays(){
        String[] s1 = new String[5];
        System.out.println("s1 array length = " + s1.length);
        System.out.println("s1[index = 0]  = " + s1[0]);
        System.out.println("adding values to each element of the array with s1[i] = value");
        s1[0] = "1one";
        s1[4] = "2two";
        s1[3] = "3three";
        s1[2] = "4four";
        s1[1] = "5five";

        for (int i = 0; i < s1.length; i++){System.out.println("String[" + i + "] array before sorting value = " + s1[i]);}
        int[] i1 = {1,3,5,2,4};
        Arrays.sort(i1); // numbers sort fine.
        Arrays.sort(s1); // strings sort: numbers sort before letters and uppercase sorts before lowercase
        for(int i : i1){
            System.out.println(i);
        }
        for (int i = 0; i < s1.length; i++){System.out.println("String[" + i + "] array after sorting value = " + s1[i]);}
    }

    public void searchingArrays(){
        // ONLY WHEN THE ARRAY IS ALREADY SORTED!!
        //BINARY SEARCH
        int[] i1 = {8,6,2,4};
        Arrays.sort(i1); // numbers sort fine.
        System.out.println("Binary search returns the index where a match has been found");
        System.out.println("Binary search returns a negative index where a match needs to be inserted to preseve sorted order");
        /*
            We negate and sbtract 1 for consistency, getting -1-1, also known as -2. Finally searching for 9 in the i1 array
            it tels us that 9 should be inserted in index 4 and we again negate and subtract 1 getting -4 -1 = -5
         */
        System.out.println("Binary search " + Arrays.binarySearch(i1,2));// 0
        System.out.println("Binary search " + Arrays.binarySearch(i1,4));// 1
        System.out.println("Binary search " + Arrays.binarySearch(i1,1));// -1
        System.out.println("Binary search " + Arrays.binarySearch(i1,3));// -2
        System.out.println("Binary search " + Arrays.binarySearch(i1,9));// -5
    }

    public void multidimensionalArrays(){
        creatingMultiDimensionalArrays();
        usingMultiDimensionalArrays();
    }

    public void creatingMultiDimensionalArrays(){
        int[][] vars1; // 2D array
        int vars2 [][]; // 2D array
        int[] vars3[]; // 2D array
        int[] vars4[], space[][]; // 2D array and 3D array

        //Symmetric multidimensional array
        vars1 = new int[3][2]; // { {3,2} ,{1,4} ,{2,5} }

        //Asymmetric multidimensional array
        vars2 = new int[][]{{3, 4, 5}, {2, 4, 5, 6}};

        int[][] vars5 = {{3, 4, 5}, {2, 4, 5, 6}};
        //Asymmetric multidimensional array
        vars3 = new int[4][];
        vars3[0] = new int[3];
        vars3[1] = new int[2];
        vars3[2] = new int[4];
        vars3[3] = new int[5];

    }

    public void usingMultiDimensionalArrays(){
        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++){
            for(int j = 0; j < twoD[i].length; j++){
                System.out.print(twoD[i][j] + " ");// printing element
            }
            System.out.println(); // time for new line between each array
        }

        twoD = new int[][]{ {32, 23}, {2,4}, {22,44} };

        for(int[] ia :twoD){
            for(int num : ia){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
