package start02;
import java.util.Scanner;
import java.math.*;
public class Main_2444_별7 {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		n = 2 * n - 1;
		//j = |i - N/2|
		//N = 2 * j + k -> k = N - 2 * j		
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < Math.abs(i-n/2); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<n-2*(Math.abs(i-n/2)); j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}
