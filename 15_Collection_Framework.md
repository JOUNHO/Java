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

## Set 컬렉션
List 컬렉션은 저장 순서를 유지하지만, Set 컬렉션은 저장 순서가 유지되지 않는다. 또한 객체를 중복해서 저장할 수 없고, 하나의 null만 저장할 수 있다. Set 컬렉션은 집합에 비유될 수 있다.
집합은 순서와 상관없고 중복이 허용되지 않는다. 또한 Set 컬렉션은 저장할때의 순서와 나올때의 순서가 다를 수 있다.

### HashSet
HasSet은 Set인터페이스의 구현 클래스이다. HashSet을 생성하기 위해서는 다음과 같이 생성자를 호출하면 된다.
> Set<E> set=new HashSet<String>();  
 HashCode() 리턴 값 ->equals() 리턴 값 -> 동등 객체
 
 ### TreeSet
 TreeSet은 이진 트리를 기반으로한 Set 컬렉션이다. 하나의 노드는 노드값인 value와 왼쪽과 오른쪽 자식 노드를 참조하기 위한 두개의 변수로 구성된다. TreeSet에 객체를 저장하면 자동으로 정렬되는데 부모값과 비교해서 낮은 것은 왼쪽 자식 노드에, 높은 것은 오른쪽 자식 노드에 저장한다.
 > TreeSet<E> treeSet=new TreeSet<E>();
 
 
 ## Map 컬렉션
 Map 컬렉션은 키(key)와 값(value)으로 구성된 Entry 객체를 저장하는 구조를 가지고 있다. 여기서 키와 값은 모두 객체이다. 키는 중복 저장될 수 없지만 값은 중복 저장될 수 있다. 만약 기존에 저장된 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 대치된다.  
 Map 컬렉션에는 HashMap, Hashtable,, LinkedHashMap,Properties, TreeMap 등이 있다. 다음은 Map 컬렉션에서 공통적으로 사용 가능한 Map 인터페이스의 메소드들이다. 키로 객체들을 관리하기 때문에 키를 매개값으로 갖는 메소드가 많다.
 
 메소드|설명
 ---|---|
 V put(K key,V value)| 주어진 키와 값을 추가, 저장되면 값을 리턴
 boolean containsKey(Object key)| 주어진 키가 있는지 여부
 boolean contatinsValue(Object value)|주어진 값이 있는지 여부
 Set<Map.Entry<K,V>> entrySet()| 키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아서 리턴
 V get(Object key)| 주어진 키가 있는 값을 리턴
 boolean isEmpty()| 컬렉션이 비어있는지 여부
 Set(K) keySet()| 모든키를 Set 객체에 담아서 리턴
 int size()| 저장된 키의 총 수를 리턴
 Collection<V> values()| 저장된 모든 값을 Collection에 담아서 리턴
 void clear()| 모든 Map.Entry를 삭제
 V remove(Object key) 주어진 키와 일치하는 Map.Entry를 삭제하고 값을 리턴
 
 ### HashMap
 HashMap은 Map 인터페이스를 구현한 대표적인 Map 컬렉션이다. HashMap의 키로 사용할 객체는 hashCode()와 equals() 메소드를 재정의해서 동등 객체가 될 조건을 정해야 한다.
 > Map<K, V> map=new HashMap<K,V>();
 
 ### Hashtable
 Hashtable은 HashMap과 동일한 내부 구조를 가지고 있다. Hashtable도 키로 사용할 객체는 hashcode()와 equals() 메소드를 재정의해서 동등 객체가 될 조건을 정해야 한다.  
 HashMap과의 차이점은 Hashtable은 동기화된 메소드로 구성되어 있기 때문에 멀티 스레드가 동시에 이 메소드들을 실행할 수는 없고, 하나의 스레드가 실행을 완료해야만 다른 스레드를 실행할 수 있다. 그래서 멀티 스레드 환경에서 안전하게 객체를 추가,삭제할 수 있다. 이것을 스레드가 안전하다고 한다.
 
 ### Properties
 Properteis는 Hashtable의 하위 클래스이기 때문에 Hashtable의 모든 특징을 그대로 가지고 있다. 차이점은 Hashtable은 키와 값을 다양한 타입으로 지정이 가능한데 비해 Properties는 키와 값을 String으로 제한한 컬렉션이다. Properties는 애플리케이션의 옵션 정보, 데이터베이스 연결 정보 그리고 국제화 정보가 저장된 프로퍼티 파일을 읽을 때 주로 사용한다.
 
 ### TreeMap
 TreeMap은 이진 트리를 기반으로 한 Map 컬렉션이다. TreeSet과의 차이점은 키와 값이 저장된 Map.Entry를 저장한다는 점이다. TreeMap에 객체를 저장하면 자동으로 정렬되는데, 기본적으로 부모 키값과 비교해서 키 값이 낮은 것은 왼쪽 자식 노드에, 키 값이 높은 것은 오른쪽 자식 노드에 Map.Entry객체를 저장한다.
 > TreeMap<K, V> treeMap=new TreeMap<K,V>();
