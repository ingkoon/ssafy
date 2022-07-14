package start02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_d1_2071_1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			int N = 10;
			int[] nums = new int[10];
			
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			for (int i = 0; i< N; i++ ) {
				nums[i] = Integer.parseInt(st.nextToken());
			}
			
			int sum = 0;
			for(int n : nums) {
				sum += n;
			}
//			System.out.printf("#%d %.0f%n", t, sum/10);
			System.out.printf("#%d %.0f%n", t, (1.0*sum/10));
		}
	}
}
