package start02;

import java.util.Scanner;

public class Main_2439_별2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			int tmp = N - (i+1);
			
			for (int j = 0; j <tmp; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k<i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
}
