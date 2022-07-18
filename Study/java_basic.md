# 1. 자바 기본

---

## 변수

- 자료를 저장하기 위한 메모리 공간으로 타입에 따라 크기가 달라짐
- 메모리 공간에 값(value)을 할당(assign) 후 사용
- 두가지로 분류
    - 기본형
        - 정해진 크기의 memory size로 표현
        - 변수 자체에 값을 저장
    - 참조형
        - 크기가 미리 정해질 수 없는 데이터를 표현시 사용
        - 변수에는 실제 값을 참조할 수 있는 주소를 저장

## 기본타입의 구분

| 구분 | Type | bit 수 | 값 |
| --- | --- | --- | --- |
| 논리형 | boolean |  | true/false |
| 정수형 | byte | 8 | -128~127 |
| 정수형 | short | 16 | -2^15 ~ 2^15-1 |
| 정수형 | int | 32 | -2^131~ 2^31-1 |
| 정수형 | long | 64 | -2^64 ~ 2^64-1 |
| 정수형 | float | 32 | float f = 0.1234567890123456789f; |
| 실수형 | double | 64 | double d = 0.1234567890123456789; |
| 문자열 | char | 16 |  |

float/double의 값은 둘다 부정확 하다. 

부동소수점을 갖고 연산을 수행 시 부정확한 결과가 나올 수 있다는 것을 알고 있자.

→ 정확한 값을 알고 싶다면 정수로 변환하여 연산을 수행한다.

다만 나눗셈을 수행 시, 정수가 아닌 실수로 나눗셈을 하여야 제대로된 부동소수타입의 값이 나온다.

## 형 변환

- 변수의 타입을 다른 타입으로 변환하는 것\
    - char → int
- 기본타입은 기본타입끼리, 참조타입은 참조타입 끼리만 형 변환이 가능
    - boolean타입은 다른 기본 타입과 호환되지 않는다.
    - 기본타입과 참조타입간의 형 변환을 위해 Wrapper 클래스를 사용한다.

## 형변환의 종류

1. 묵시적 형 변환
    1. 작은 데이터 타입에서 큰 데이터 타입으로 이동할 때
    2. 값의 손실이 발생하지 않는다. (확장이기 때문에)
    3. 따라서 생략이 가능하다. (JVM이 기능 제공)
2. 명시적 형 변환
    1. 큰 데이터 타입에서 작은 데이터 타입으로 이동할 때
    2. 값의 손실 발생
    3. 따라서 명시적으로 형 변환을 선언해 주어야 한다.
    

+  short와 char은 같은 크기의 공간이지만 표현자체가 달라 변환이 되지 않는다. 

```java
public static void main(Stirng[] args){
	int i1 = Integer.MAX_VALUE;
	long l1 = i1 + 1;
	System.out.println(l1) //오버 플로우 발생

	long 12 = (long)(i1 + 1);
	System.out.println(l1) //오버 플로우 발생

	long l3 = (long)i1 + 1;
	System.out.println(l1) //오버 플로우 발생x

	long i3 = 1000000 * 1000000 / 10000; // 오버 플로우 발생
	long i4 = 1000000 / 100000 * 100000; // 오버플로우 때문에 값이나오지 않음
}
```

다음 케이스에서의 문제

```java
public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;

        byte b3 = b1 + b2; //-> type mismatch: cannot convert from int to byte

        int i1 = 10;
        long l1 = 20;
        int i2 = i1 + l1;  //-> type mismatch: cannot convert from long to int

        float f1 = 10.0; 
        float f2 = f1 + 20.0; //-> type mismatch: cannot convert from double to float
    }
```

1. 피연산자의 크기가 4바이트 미만이면 int로 변경 후 연산진행
2. 산술 이항 연산자는 연산 전에 피연산자의 타입을 일치시킨다.
3. 두개의 피연산자 중 큰타입으로 형 변환 후 연산 진행

|  || 의 차이는 전부다 보는 것과/일부만 보는것의 차이가 있다.