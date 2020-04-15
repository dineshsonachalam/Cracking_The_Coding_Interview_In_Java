package com.algorithms.basics;
import java.util.Scanner;
/*
 *  GCD:
 *  The greatest common divisor of two or more integers, which are not all zero, is the largest positive integer that divides each of the integers.
 *  Whiteboard: https://imgur.com/gallery/oSxe6uJ
 */

public class GCD {
    public  static  void  main(String []args){
        Scanner scan = new Scanner(System.in);
        int divisor = scan.nextInt();
        int divident = scan.nextInt();
        while (divident%divisor!=0){
            int remainder = divident%divisor;
            divident = divisor;
            divisor = remainder;
        }
        System.out.println(divisor);
    }
}
