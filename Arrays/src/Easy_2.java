import java.io.*;
import java.util.*;
public class Easy_2{
	private static int hourGlass(int [][]a,int hourGlassHeight,int hourGlassWidth) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<hourGlassHeight;i++)
		{
			for(int j=0;j<hourGlassWidth;j++) {
				int temp = a[i][j]+a[i][j+1]+a[i][j+2] + // 1st row
						   a[i+1][j+1]+ // 2nd row
						   a[i+2][j]+a[i+2][j+1]+a[i+2][j+2]; // 3rd row
				max = Math.max(temp, max);
			}
		}
		return max;
	}

	public static void main(String[] args)
    {
		Scanner scan = new Scanner(System.in);
		int r = 6;
		int c = 6;
		int hourGlassHeight = r - 2;
		int hourGlassWidth = c - 2;
 		int [][] a= new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j] = scan.nextInt();
			}
		}
		int maxHourGlass = hourGlass(a,hourGlassHeight,hourGlassWidth);
		System.out.println(maxHourGlass);
    }
}