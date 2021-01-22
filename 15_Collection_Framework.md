# 컬렉션 프레임워크
자바는 배열의 문제점을 해결하고, 널리 알려져 있는 자료구조를 바탕으로 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 java.util 패키지에 컬렉션과
관련된 인터페이스와 클래스들을 포함시켜 놓았다. 이들을 총칭해서 컬렉션 프레임워크라고 부른다.  
컬렉션 프레임워크의 주요 인터페이스로는 List, Set,Map이 있다.

## List 컬렉션
List 컬렉션은 객체를 일렬로 늘어놓은 구조를 가지고 있다. 객체를 인덱스로 관리하기 때문에 객체를 저장하면 자동 인덱스가 부여되고 인덱스로 객체를 검색, 삭제할
수 있는 기능을 제공한다. List 컬렉션에는 ArrayList,Vector,LinkedList 등이 있는데, 다음은 List 컬렉션에서 공통적으로 사용 가능한 List 인터 페이스의 메소드들이다.

메소드|설명|
---|---|
 boolean add(E e)|주어진 객체를 맨 끝에 추가
 void add(int index,E e)|주어진 인덱스에 객체를 추가
set(int index,E e)|주어진 인덱스에 저장된 객체를 주어진 객체로 바꿈
 boolean contains(Object o)| 주어진 객체가 저장되어 있는지 여부
 E get(int index)| 주어진 인덱스에 저장된 객체를 리턴
 isEmpty()| 컬렉션 비어 있는지 조사
 int size()| 저장되어 있는 전체 객체 수를 리턴
 void clear()| 저장된 모든 객체를 삭제
 E remove(int index)| 주어진 인덱스에 저장된 객체를 삭제
 boolean remove(Object o)| 주어진 객체를 삭제
 
 ### ArrayList
 ArrayList는 List 인터페이스의 **구현 클래스**로, ArrayList에 객체를 추가하면 객체가 인덱스로 관리된다. 배열은 생성할 때 크기가 고정되고
 사용 중에 크기를 변경할 수 없지만, ArrayList는 저장 용량을 초과한 객체들이 들어오면 자동적으로 저장 용량이 늘어난다.  
 * 빈번한 객체 삭제와 삽입이 일어나는 곳에서는 ArrayList 사용이 바람직하지 않다. 이런 경우라면 LinkedList를 사용
 * 인덱스 검색이나, 맨 마지막에 객체를 추가하는 경우에는 ArrayList가 더 좋은 성능을 가짐

### Vector
Vector는 ArrayList와 동일한 내부 구조를 가지고 있다. ArrayList와 다른 점은 Vector는 동기화된 메소드로 구성되어 있기 때문에 멀티 스레드가
동시에 이 메소드들을 실행할 수 없고, 하나의 스레드가 실행을 완료해야만 다른 스레드를 실행할 수 있다. 그래서 멀티 스레드 환경에서 안전하게 객체를 추가,삭제할 수 있다.  
> List<E> list=new Vector<E>();

### LinkedList
LinkedList는 List 구현 클래스이므로 ArrayList와 사용 방법은 똑같지만 내부 구조는 완전 다르다. ArrayList는 내부 배열에 객체를 저장해서 인덱스로 관리하지만, LinkedList는 인접 참조를 링크해서 체인처럼 관리한다.  
LinkdeList에서 특정 인덱스의 객체를 제거하면 앞뒤 링크만 변경되고 나머지 링크는 변경되지 않는다. 특정 인덱스에 객체를 삽일할 때에도 마찬가지이다.
> List<E> list=new LinkedList<E>();
