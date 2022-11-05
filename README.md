# kotlin-racingcar

## 문자열 계산기 미션

### 요구사항 명세서

1. [x] 사용자가 입력한 값을 검증한다. 
   1. [x] null 값이라면 예외를 던진다.
   2. [x] 빈 공백문자열이라면이라면 예외를 던진다.
   3. [x] 계산할 수 없는 경우 , 사칙 부호가 아닌 경우 , 숫자가 아닌 영문자가 피연산자로 들어온 경우 , 0으로 나눈 경우도 예외를 던진다.
2. [x] 입력한 값을 ' ' 띄여쓰기로 구분한다.
3. [x] 순차적으로 계산하고, 결과값을 반환한다.
