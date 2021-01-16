# 조건문과 반복문

## 조건문(if,switch)

### if문을 이용한 주사위 번호 뽑기

Math.random() 메소드는 0.0과 1.0 사이에 속하는 double 타입의 난수 하나를 리턴한다. 0.0은 포함, 1.0은 포함X
> 0.0<=Math.random()<1.0 

이 상태에서 원하는 범위의 값을 곱하고 int 타입으로 강제 타입 변환하면 범위에 속하는 하나의 정수값을 얻을 수 있다.
> 0<=(int)(Math.random()*10)<10

예를 들어, 로또 번호 하나를 뽑기 위해 다음 연산식을 사용할 수 있다.
> int num=(int)(Math.random()*45)+1;


### 중첩 if문

if문의 블록 내부에 또다른 if문


### switch 문

switch문은 괄호 안의 값과 동일한 값을 갖는 case로 가서 실행문을 실행시킨다. 만약 동일한 값이 없다면 default로 가서 실행문을 실행시킨다. 주의할 점은 break가 없다면 다음 case가 연달아 실행되는데, 이땐 case값과는 상관없이 실행된다.

```java
switch(변수){
  case 값1:
  
      break;
  case 값2:
  
      break;
  case 값3:
  
      break;
```

## 반복문(for, while, do-while)

### for문
for문은 2.조건식 ->3.실행문(true) ->4.증감식 으로 반복한다.
> for(1.초기화식;2.조건식;4.증감식) {3.실행문}
### while문
for문이 정해진 횟수만큼 반복한다면, while문은 조건식이 true일 경우에 계속해서 반복한다.
> while(조건식){실행문}
### do while문
do while문은 while문과 동일하지만, while문은 시작할 때부터 조건식을 검사하여 블록 내부를 실행할지 결정하지만, do-while문은 블록 내부를 먼저 한번 실행시키고 조건식을 검사해 반복할지 결정한다.
> do{실행문}while(조건식)

### break
만약 반복문이 중첩되어 있을 경우 break문은 가장 가까운 반복문만 종료하고 바깥쪽 반복문은 종료시키지 않는다.
중첩 반복문에서 바깥쪽 반복문가지 종료시키려면 바깥쪽 반복문에 이름(라벨)을 붙이고, break 이름;을 사용하면 된다.
```java
Label: for(){
  for(){
    break Label;
  }
 }
```
### continue
continue문이 실행되면 for문의 증감식, while문,do-while문의 조건식으로 이동한다.

