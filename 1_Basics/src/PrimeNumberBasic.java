import java.util.Scanner;

/* 
 *  Prime Number: A number divisible by itself and 1. 
 *  It's series n/2,....n/n-1
 *  Whiteboard: https://imgur.com/gallery/sN4EOuk
 */


public class PrimeNumberBasic {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		int divisor = 2;
		boolean prime = true;
		while(divisor<=n-1) {
			if(n%divisor==0) {
				prime = false;
				break;
			}
			++divisor;
		}
		if(prime == true) {
			System.out.println("A prime number");
		}else {
			System.out.println("Not a prime number");
		}
	}

}
