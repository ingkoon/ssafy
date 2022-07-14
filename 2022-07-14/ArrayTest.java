package start02;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		// 배열이란 같은 타입의 나열
		// 타입이 우선이다.
		int[] a = {1, 2, 3};
		int[] b = new int[3]; //-> new 선언 시, 0으로 초기화 된다.
		
//		a = {1,2,3}; -> 정적 재할 당 금지
		
		b = new int[] {1,2,3,4,5,6,7};
		System.out.println(a.length);
		a[1]  =- 15;
		
		int[]c = a;
		int[]d = new int[b.length];
		
		System.arraycopy(b, 0, d, 0, b.length); //깊은 복사
		d = (int[])b.clone(); 
		
		c[0] = -25;
		d[0] = -25;
		
		System.out.println(Arrays.toString(a)); // 배열 주소의 값을 문자열로 변경
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(d));
		Arrays.fill(a, -1); // 배열 a를 -1로 만들기
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));
		
		b = new int[] {4,5,6,7,1,2,3}; // 생성과 초기화
		Arrays.sort(b);				   // 정렬 ASC 증가순
		System.out.println(Arrays.toString(b));
		
		// for 문
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " ");
		}
		System.out.println();
		
		//향상된 for문
		for(int n : b) {
			System.out.println(n + " ");
		}
		System.out.println();
	}
	
}
