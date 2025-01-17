    /*Three types of errors are 
     * 1. Syntax error
     * 2. Logical error
     * 3.Runtime error
     */

import java.lang.*;
public class Test {
 public static void main(String[] args) {
     int[] numerators={10,200,30,40};
     int[] denominators={1,2,0,4};
     for(int i=0;i<numerators.length;i++)
     {
        System.out.println(divide(numerators[i], denominators[i]));
     }
     System.out.println("Good job :)");
 }
 public static int divide(int a, int b) {
    try{
        return a/b;
    }
    catch(ArithmeticException e){
       System.out.println("Next elements are");
       return -1;
    }
 }
}
/*This the code for exception handling by using try and catch block with ArithimeticException */