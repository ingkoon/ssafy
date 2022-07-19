# 2. 배열

---

Q. 동일한 타입 변수를 여러개 사용할 경우?

- 코드 수 증가
- ~~코드의 길이 증가~~
- 반복문 적용 불가
- 변수 의 수가 동적으로 결정될 경우 사용 불가

## 배열

- 동일한 타입의 데이터 0개 이상을 하나의 연속된 메모리 공간에서 관리하는 것
- 요소에 접근하는 속도가 매우 빠르다.
- 한번 생성하면 크기 변경 불가

## 배열의 생성

- 타입[] 변수명; 또는 타입 변수명[]

```java
int[] points; 
String[] names;
```

- 변수의 타입과 저장하는 데이터의 타입?

```java
int a;
int[] arr;
/*
a의 타입 -> int

arr의 타입 -> 참조형 타입

arr이 저장하는 데이터의 타입? int 타입
arr은 int 를 저장하는 참조형 타입
*/
```

- 생성
    - new 키워드와 함께 저장하려는 데이터 타입 및 크기 지정: new data_type[length]
        - new int[3]; → int타입의 자료 3개를 저장할 수 있는 배열을 메모리에 생성
        - points = new int[3]; → 생성된 배열을 points라는 변수에 할당
        - points는 메모리에 있는 배열을 가리키는 reference타입 변수
        
    - 생성과 동시에 할당한 값으로 초기화
        - int[] b = new int[] {1,3,5,6,8};
        - int[] c = {1,3,5,6,8};
    - 선언과 생성을 따로 처리할 경우 초기화 주의
        - int[] points;
            - points = {1, 3, 5, 6, 8};  //컴파일 오류 발생
        - int[] points;
            - points = new int[]{1, 3, 5, 6, 8}; // 선언할 때 배열의 크기를 알 수 없을 때
- 초기화
    - 배열의 생성과 동시에 저장 대상 자료형에 대한 기본값으로 default 초기화 진행
    
    | 자료형 | 기본값 | 비고 |
    | --- | --- | --- |
    | boolean | false |  |
    | char | '\u0000’ | 공백문자 |
    | byte, short, int | 0 |  |
    | long | 0L |  |
    | float | 0.0f |  |
    | double | 0.0 |  |
    | 참조형 변수 | null | 아무것도 참조하지 않음 |
- 사용
    - 배열은 INDEX번호를 가지고 각 요소에 접근 가능
        - index는 0부터 시작
        - 길이: 배열 이름.length로 배열의 크기 조회 가능
    
    ```java
    int[] points = new int[3]
    
    points[0] = 1;
    points[1] = 'A'; //-> 형변환이 발생한다.(A의 값인 65저장됨)
    points[2] = '1.5' //-> double 할당 불가
    
    System.out.println(points[0]) //-> 1
    System.out.println(points[1]) //-> 65
    System.out.println(points[2]) //-> 0
    ```
    

배열 출력 시, array.toString()을 사용할 경우 배열 자체의 값을 출력한다.

## for-each with Array

- 가독성 개선된 반복문, 배열 및 Collections에서 사용
- index 대신 직접 요소에 접근하는 변수를 제공
    - naturally read only(copied value)
- 사용

```java
int intArray[] = {1, 3, 5, 7, 8};
for(int x: intArray){
	System.out.println(x);
}
```

index를 사용하지 않아도 되지만 사용할 수 없다. → 용도에 따라 사용

배열은 불변성을 갖는다.

- 배열은 최초 메모리 할당 이후 변경할 수 없다.

```java
int[] nums = {1,2,3}; 
nums = new int[] {1,2,3,4}; // 새로운 배열로 초기화한 것이다. 위의 값은 가비지가 된다.
num[1] = 100;
```

- 개별 요소는 다른 값으로 변경이 가능하나, 요소를 추가하거나 삭제할 수는 없다

API 제공하는 배열복사 method

- System.arrayCopy → 원본 배열에 새로운 배열을 덮어 씌운다.
- Arrays.copyOf

배열 내에서 -1은 실패함을 말한다.

객체의 생성은 new를 통해 생성 
→ 클래스 영역에 생성 힙에 생성 생성자에 값 받고 레퍼런스를 받는다.