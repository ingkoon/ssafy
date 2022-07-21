# 5. JVM 메모리 구조

---

크게 3가지로 나뉜다

- Class Area
    - 클래스의 원형 로딩
        - field 정보
        - method 정보
        - 타입 정보
        - 상수 풀
- method stack
    - 메서드들의 실행 공간
    - thread 별로 별도 관리
    - 메서드 호출 순서대로 쌓이는 구조
    - 메서드 프레임에 로컬 변수도 쌓이는 구조
    - 로컬 변수는 선언된 영역을 벗어나면 삭제
- heap
    - 객체를 저장하기 위한 영역
        - thread에 의해 공유
        - 생성된 객체는 프로그래머가 삭제불가
        - GC를 통한 객체 삭제 수행
    
    ```java
    public static void main(String[] args) {
    		// TODO Auto-generated method stub
    		// 붕어빵 틀을 통해 붕어빵을 만드는 과정과 같다...!
    	
    		Person p= new Person(); // Person 즉 클래스 이름은 타입!
    		p.name = "이인재";
    		p.age = 30;
    		p.isHungry = true;
    		p.eat();
    		System.out.println(p.name + " : " + p.isHungry);
    		
    		Person p2 = new Person();
    		p2.name = "이인재2";
    		System.out.println(p2.name + " : " + p2.isHungry);
    		
    	}
    ```
    
    클래스 영역에 로딩 
    
    → 메인 메서드 실행 시 method stack에 스택 풀이 생성 
    
    → 객체 생성 시 스택 풀에 객체 생성, 객체에 대한 정보는 힙에 지정 
    
    → 스택 풀에 생성된 객체는 힙영역에 있는 객체의 정보 주소를 갖는다.
    
    → 메모리를 할당하여 name변수의 값 ”이인재”를 생성(String은 참조형이기 때문에)
    
    → 힙영역에 있는 name이 변수값의 주소를 참조한다.
    
    ## 변수의 종류
    
    ---
    
    타입에 따른 분류
    
    기본형 기본 8가지 타입의 변수
    
    참조형 나머지 모든것(객체 참조)
    

| 종류 | 변수 종류 | 선언 위치 |
| --- | --- | --- |
| 멤버 변수 | 클래스 멤버 변수 | 클래스영역
(static keyword) |
|  | 인스턴스 멤버변수 | 클래스영역 |
| 지역변수 | 지역변수 | 함수 내부 |
|  | 파라미터 변수 | 함수 선언부 |

## 인스턴스 멤버 변수

- 선언 위치: 클래스 {} 영역에 선언

```java
public class Person{
	String name;
	int age;
}
```

- 변수의 생성: 객체가 만들어질 때 객체 별로 생성됨
    - 생성 메모리 영역 : heap
- 변수의 초기화: 타입별로 default 초기화
- 변수에의 접근
    - 객체 생성
    - 객체 이름으로 접근
    - 객체 생성 시 객체별 생성 → 객체마다 고유한 상태 유지
- 소멸시점
    - GC에 의해 객체가 소멸
    

## 클래스 멤버 변수

- 선언 위치
    - 클래스 영역에 선언되며 static 키워드 삽입
    
    ```java
    public class Person{
    	static String scientificName = "Homo sapiens";
    	String name;
    }
    ```
    
- 변수 생성
    - 클래스 영역에 클래스 로딩 시 메모리 등록
        - 객체 생성과 무관
        - 모든 객체가 공유(공유 변수)
- 변수의 초기화
    - 타입별 default 초기화
- 변수에 접근
    - 객체 생성과 무관하게 클래스 이름으로 접근
        - 객체를 생성하고 객체 이름으로 접근 가능하지만 static에 부합 표현x
    
    ```java
    Person p = new Person();
    p.scientificName = "객체를 통한 변경";
    
    Person.scientificName = "클래스를 통한 변경";
    ```
    
- 소멸 시점
    - 프로그램 종료 시

## 지역변수 & 파라미터 변수

- 선언 위치
    - 클래스 영역의 {} 이외의 모든 중괄호 안에 선언되는 변수들
        - 메서드, 생성자, 초기화 블록
    
    ```java
    void call(Stirng to){
    	String beep = "띠";
    	for(int i = 0; i< 3; i++) System.out.println(beep)
    }
    ```
    
- 변수의 생성
    - 선언된 라인이 실행될 때
    - thread별 생성된 stack영역
- 변수의 초기화
    - 사용하기 전 명시적 초기화 필요
- 변수의 접근
    - 외부에서 접근이 불가능
    - 소속 불필요
    - 내부에서는 이름으로 바로 접근
- 소멸 시점
    - 선언된 영역인 {}을 벗어날 때