package start02;

// 1번 오브젝트
// 2번 패키지 물리적 디렉토리 -> 패키지를 통한 데이터 은닉화 2단계가 설정 된다.
// 
import java.util.Scanner;

public class ForTest2 {
	
	public static void main(String[] args) {
		
		// 타입 기본() 참조
		Scanner sc = new Scanner(System.in);
		
		//연도
		int n = sc.nextInt();
		//얼마씩
		int a = sc.nextInt();
		double r = sc.nextDouble();
		
		// 1 800000 2
		// 1년당 800000 2%씩
		double sum = 0;
		
		double b = a;
		// 초기 조건 반복 스텝 조건 ... 조건 끝
		// i = i+1   i += 1   i++
		for(int i = 0; i<n * 12; i++) {
			b *= (1 + r/100/12);
			sum += b;
		}
		System.out.println(String.format("%.0f", sum));
	}
	
}
