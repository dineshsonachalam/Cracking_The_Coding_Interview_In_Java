import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day_1 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        /*extLine() reads till \n but after the double input there is a new line followed by the string. so u can skip it using one nextLine() as shown below.
*    
*
*/    
        int j = scan.nextInt();
        double k = scan.nextDouble();
        String l = "";
        l = scan.nextLine();
        l = scan.nextLine();

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+j);
        /* Print the sum of the double variables on a new line. */
		System.out.println(k+d);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        l = s + l;
        System.out.println(l);
        scan.close();
    }
}