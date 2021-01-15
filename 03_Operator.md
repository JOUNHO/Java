# 연산자

## Integer.toBinaryString()
정수값을 총 32비트의 이진 문자열로 리턴하는 메소드
```java
int a=5;
String result=Integer.toBinaryString(a);
System.out.print(result);  //101 출력
```

## 정확한 계산은 정수 사용
정확하게 계산해야 할 때는 부동소수점(실수) 타입을 사용하지 않는 것이 좋다.

## 문자열 연결 연산자(+)
문자열 연결 연산자인 +는 문자열을 서로 결합하는 연산자이다. +연산자는 산술 연산자, 부호 연산자인 동시에 문자열 연결 연산자이기도 하다.
```java
String str1="JDK"+8.0;  //JDK8.0
String str2=str1+"특징"; //JDK8.0특징
String str3="JDK"+3+3.0; //JDK33.0
String str4=3+3.0+"JDK"; //6.0JDK
```
* 문자열과 숫자가 혼합된 +연산식은 왼쪽에서부터 오른쪽으로 연산이 진행된다.

## 비교 연산자(<,<=,>,>=,==,!=)
비교 연산자는 대소 또는 동등을 비교해서 boolean 타입인 true/false를 산출한다.

* 만약 피연산자가 char 타입이면 유니코드 값으로 비교 연산을 수행한다. 예를 들어 'A'의 유니코드는 65이고, 'B'의 유니코드는 66이므로 비교 연산자는 65와 66을 비교하게 된다.
```java
('A'<'B') ->(65<66)
```

## 문자열 비교 함수(equals())
자바에서 String 변수를 비교할 때 ==연산자를 사용하면 원하지 않는 결과가 나올 수 있다. 그래서 문자열을 비교하는 equals함수를 사용한다.
```java
String s="조운호";
String s2=new String("조운호");
System.out.println(s2=="s"); //false
System.out.println(s.equals(s2)); //true
```

## 비트 연산자(&,|,^,~,<<,>>,>>>)
비트 연산자는 데이터를 비트 단위로 연산한다. 즉 0과 1이 피연산자가 된다. 그렇기 때문에 0과 1로 표현이 가능한 정수 타입만 비트 연산을 할 수 있다. 실수 타입인 float와 double은 비트 연산을 할 수 없다.

* 비트 논리 연산자(&,|,^,~)
  * & : AND
  * | : OR
  * ^ : XOR
  * ~ : NOT
  
* 비트 이동 연산자(<<,>>,>>>)
  * a << b: 정수 a의 각 비트를 b만큼 왼쪽으로 이동(빈 자리는 0으로 채워진다.)  결과는 a*(2^b)
  * a >> b: 정수 a의 각 비트를 b만큼 오른쪽으로 이동(빈자리는 정수 a의 최상위 부호비트와 같은 값으로 채워진다.) 
  * a >>> b: 정수 a의 각 비트를 b만큼 오른쪽으로 이동(빈자리는 0으로 채워진다.)
  
## 삼항 연산자(?:)
> 조건식 ? 값 또는 연산식(true) : 값 또는 연산식(false)

```java
int score=95;
char grade=(score>90) ? 'A':'B'; //grade='A'
```