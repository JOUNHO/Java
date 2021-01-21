# 예외 처리
자바에서는 예외를 클래스로 관리한다. JVM은 프로그램을 실행하는 도중에 예외가 발생하면 해당 예외 클래스로 객체를 생성한다. 그리고 나서 예외 처리 코드에서 예외 객체를 이용할 수 있도록 해준다.
모든 예외 클래스들은 java.lang.Exception 클래스를 상속받는다.

## 실행 예외
실행 예외는 자바 컴파일러가 체크를 하지 않기 때문에 오로지 개발자의 경험에 의해서 예외 처리 코드를 삽입해야 한다. 만약 개발자가 실행 예외에
대해 예외 처리 코드를 넣지 않았을 경우, 해당 예외가 발생하면 프로그램은 곧바로 종료된다.

* NullpointerException
이 것은 객체 참조가 없는 상태, 즉 null 값을 갖는 참조 변수로 객체 접근 연산자인 도트를 사용했을 때 발생한다. 객체가 없는 상태에서 객체를 사용하려 했으니 예외가 발생하는 것이다.

* ArrayIndexOutOfBoundsException
배열에서 인덱스 범위를 초과하여 사용할 경우 실행 예외인 ArrayIndexOutOfBoundsException이 발생한다. 예를 들어 길이가 3인 int arr[]=new int[3]배열을 선언했다면,
배열 항목을 지정하기 위해 인덱스 0~2를 사용할 수 있다. 하지만, arr[3]을 사용하면 인덱스 범위를 초과했기 때문에 ArrayIndexOutOfBoundsException이 발생한다.

* NumberFormatException
프로그램을 개발하다 보면 문자열로 되어 있는 데이터를 숫자로 변경하는 경우가 자주 발생한다. 문자열을 숫자로 변환하는 방법은 여러 가지가 있지만, 가장 많이 사용되는
코드는 다음과 같다.

반환타입|메소드명|설명
---|---|---|
int|Integer.parserInt(String s)|주어진 문자열을 정수로 변환해서 리턴
double|Double.parserDouble(String s)|주어진 문자열을 실수로 변환해서 리턴

이  메소드들은 매개값인 문자열이 숫자로 변환될 수 있다면 숫자를 리턴하지만, 숫자로 변환될 수 없는 문자가 포함되어 있다면 NumberFormatException예외를 발생시킨다.

* ClassCastException
타입 변환은 상위 클래스와 하위 클래스 간에 발생하고 구현 클래스와 인터페이스 간에도 발생한다. 이러한 관계가 아니라면 클래스는 다른 클래스로 타입 변환할 수 없다. 억지로 타입 변환을 시도할 경우 ClassCarException이 발생한다.

## 예외 떠넘기기
메소드 내부에서 예외가 발생할 수 있는 코드를 작성할 때 try-catch 블록으로 예외를 처리하는 것이 기본이지만, 경우에 따라서는 메소드를 호출한 곳으로 예외를 떠넘길 수도 있다. 이때 사용하는 키워드가 
**throws**이다. throws 키워드는 메소드 선언부 끝에 작성되어 메소드에서 처리하지 않은 예외를 호출한 곳으로 떠넘기는 역할을 한다.
> 리턴타입 메소드명(매개변수,...) throws Exception {}