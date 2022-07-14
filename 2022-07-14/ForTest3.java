package start02;


public class ForTest3 {
	// 테일러 급수
 	public static void main(String[] args) {
		int n = 30;
		
		double sum = 1.0;
		double a = 1.0;
		
		for(int i = 1; i< n+1; i++) {
//			tmp += i;
//			sum += ((double)1.0/tmp);
			a /= i;
			sum += a;
		}
		System.out.println(sum);
	}
}
