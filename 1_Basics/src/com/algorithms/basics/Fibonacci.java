package com.algorithms.basics;
import java.util.Scanner;
import java.util.ArrayList;


/*
 *  Fibonacci numbers: A series of numbers in which each number is the sum of the two preceding numbers.
 *  It's series 0, 1, 1, 2, 3, 5, 8,
 *  Whiteboard: https://imgur.com/gallery/w0Ofe4h
 */

public class Fibonacci {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int fibRange = scan.nextInt();
        ArrayList<Integer> fibList = new ArrayList<Integer>();
        int firstFibNo = 0;
        int secondFibNo = 1;
        int nextFibNo = 0;
        for(int counter=1;counter<=fibRange;counter++){
            fibList.add(firstFibNo);
            nextFibNo = firstFibNo + secondFibNo;
            firstFibNo = secondFibNo;
            secondFibNo = nextFibNo;
        }
        System.out.println(fibList);
    }
}
