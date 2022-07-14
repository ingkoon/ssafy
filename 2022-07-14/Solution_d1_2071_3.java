package start02;
import java.util.Scanner;

public class Solution_d1_2071_3 {
	
	static int sums(int[] nums) {
		//로직
		int sum = 0;
		for(int n : nums) {
			sum += n;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t ++) {
			int N = 10;
			int[] nums = new int[10];
			
			for(int i = 0; i< N; i++) 
				nums[i] = sc.nextInt();
			
			System.out.printf("#%d %.0f%n", t, (1.0 * sums(nums)/N));
		}
	}
	
}
