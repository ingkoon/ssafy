package start02;

// 1번 오브젝트
// 2번 패키지 물리적 디렉토리 -> 패키지를 통한 데이터 은닉화 2단계가 설정 된다.
// 
import java.util.Scanner;

public class ForTest {
	
	public static void main(String[] args) {
		
		// 타입 기본() 참조
		Scanner sc = new Scanner(System.in);
		
		//자바는 타입 체크형 -> checked exception
		//IO에서는 노드를 통한 연결이 이루어진다. Scanner는 filter이다.
		int n = sc.nextInt();
		
		// 항등원을 적어주는 것이 필요하다. 덧셈은 0, 곱셈은 1
		int sum = 0;
		
		// 초기 조건 반복 스텝 조건 ... 조건 끝
		// i = i+1   i += 1   i++
		for(int i = 1; i<n+1; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
	

}
