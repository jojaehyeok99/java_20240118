package ch01;

import java.util.Scanner;

public class C_Operator {

	public static void main(String[] args) {
		
		// 연산자
		int a = 15;
		int b = 7;
		double c = 15.0;
		double d = 7.0;
		
		int intResult;
		double doubleResult;
		
		// 산술연산자 : 사칙연산 작업, 숫자 데이터에 대해서 연산을 수행
		
		// 덧셈연산자 : +
		// 좌항에 우항을 더한 값을 반환
		intResult = a + b;
		doubleResult = c + d;
		
		doubleResult= a + b;
		intResult = (int) (c + d); // (c + d)처럼 괄호를 안넣고 c+d를 하게 되면 c에 대해서만 int로 변함
		
		// 정수 + 실수 = 실수
		doubleResult = a + d; // intResult x
		
		// 뺄셈 연산자 : -
		// 좌항에 우항을 뺀 결과를 반환
		intResult = a - b;
		doubleResult = c - d;
		
		// 정수 - 실수 = 실수
		doubleResult = a- d;
		
		// 곱셈 연산자 : *
		// 좌항에 우항을 곱한 결과를 반환
		intResult = a * b;
		doubleResult = c * d;
		
		// 정수 * 실수 = 실수
		doubleResult = a * d;
		
		// 나눗셈 연산자 : /
		// 좌항에 우항을 나눈 결과를 반환
		// 정수 나누기 정수의 결과는 실수부가 버려짐
		intResult = a / b;
		//System.out.println(intResult);
		doubleResult = c / d;
		//System.out.println(doubleResult);
		doubleResult = a / d;
		//System.out.println(doubleResult);
		
		// 나머지 연산자 : %
		// 좌항에 우항을 나눈 나머지를 반환
		intResult = a % b;
		doubleResult = c % d;
		//System.out.println(intResult);
		//System.out.println(doubleResult);
		
		// 증감 연산자
		// 피연산자의 값을 1 증가 혹은 감소
		// 증가 연산자 : ++
		// 감소 연산자 : --
		int number = 5;
		intResult = ++number + 5; // 11
		intResult = number++ + 5; // 10
		// 왼쪽에서 오른쪽으로 읽기 때문에 ++ 위치에 따라 결과가 다르게 나올수 있음
		// System.out.println(intResult);
		// System.out.println(number); 
		
		// ----------------------------------------------------//
		
		// 대입 연산자 : 좌항에 우항을 할당
		// 일반 대입 연산자 : = 
		// 상수에 초기화를 할때를 제외하고 좌항이 반드시 변수이어야 함 ex. 11(상수) = 10;
		// 좌항에 우항을 할당
		number = 10;
		
		// 복합 대입 연산자 : 산술연산=
		// 좌항에 우항을 연산한 결과를 좌항에 할당
		number += 10; // 10 + 10 = 20 -> number에 할당
		number -= 7; // 20 - 7 = 13 -> number에 할당
		number *= (7 -5); // 13 * (7-5) = 26 -> number에 할당
		// System.out.println(number);
		
		// 좌항에 사용되는 변수는 반드시 초기화가 되어 있어야 함
		// 좌항에는 변경가능한 일반 변수가 와야함 (상수 불가능)
		// int number1;
		// number1 += 10; -> 초기화가 안되어 있어 오류
		
		//---------------------------------------------------//
		
		// 비교 연산자 : 좌항과 우항을 비교하여 그 결과를 논리값으로 반환
		boolean booleanResult;
	
		// 동등, 부등 비교 연산자
		// == : 좌항과 우항이 같으면 true, 다르면 false
		// != : 좌항과 우항이 다르면 true, 같으면 false
		booleanResult = a == b;
		//System.out.println(booleanResult);
		booleanResult = a != b;
		//System.out.println(booleanResult);
		
		String string = "Hello";
		booleanResult = string == "Hello";
	    //System.out.println(booleanResult);
		
		// 작다, 작거나 같다 비교 연산자 
		// < : 좌항이 우항보다 작으면 true, 같거나 크면 false
		// <= : 좌항이 우항보다 작거나 같으면 true, 크면 false
		booleanResult = a < b;
		//System.out.println(booleanResult);
		booleanResult = a <= c;
		//System.out.println(booleanResult);
		
		// 크다, 크거나 같다 비교 연산자
		// > : 좌항이 우항보다 크면 true, 같거나 작으면 false
		// >= : 좌항이 우항보다 크거나 작으면 true, 작으면 false
		booleanResult = a > c;
		//System.out.println(booleanResult);
		booleanResult = a >= c;
		//System.out.println(booleanResult);
		
		//-------------------------------------------------//
		
		// 논리 연산자 : 피연산자가 모두 논리형태로 논리 값을 조합하는 것
		// AND 연산자
		// && : 좌항과 우항이 모두 true면 true, 하나라도 false면 false
		booleanResult = true && true;
		booleanResult = false && false;
	    //System.out.println(booleanResult);
	    booleanResult = a < b && c > d;
	    //System.out.println(booleanResult);
	    
	    // OR 연산자
	    // || : 좌항과 우항 중 하나라도 true면 true, 모두 false면 false
	    booleanResult = true || true;
	    //System.out.println(booleanResult);
	    booleanResult = a < b || c > d;
	    //System.out.println(booleanResult);
	    
	    
	    // a: 15, b: 7
	    booleanResult = (a > b) && (a > ++b);
	    //System.out.println(booleanResult);
	    //System.out.println(b);
	    // AND 연산자 검증 : 앞에가 true이면, 뒤에 연산자 검증 / 앞에가 false이면, 뒤에 연산자 검증안함
	    booleanResult = (a > b) || (a > ++b);
	    //System.out.println(booleanResult);
	    //System.out.println(b);
	    // OR 연산자 검증 : 앞에가 true이면, 뒤에 연산자 검증안함 / 앞에가 false이면, 뒤에 연산자 검증
	    
	    // 삼항 연산자 : 간단한 조건에 따라 결과를 반환하는 연산자
	    // 조건(논리식) ? 참일때결과 : 거짓일때 결과
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("나이 : ");
	    
	    int age = scanner.nextInt();
	    
	    String stringResult = age > 19 ? "성인" : "미성년자"; // 두개의 타입이 같아야 함
	    System.out.println(stringResult);
	}

}
