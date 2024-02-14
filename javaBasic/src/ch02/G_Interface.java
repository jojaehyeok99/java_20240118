package ch02;

// 인터페이스 : 클래스가 구현해야만하는 메서드들을 선언하는 참조 타입 // 의사소통
// 특징 : 
// 1. 인터페이스의 모든 변수는 public static final 형태가 와야함
// 2. 인터페이스의 모든 메서드는 public abstract 형태가 와야함(default 나 static 메서드가 올 수도 있음)
// 3. 인터페이스는 다중 구현이 가능
// 문법 : 접근제어자 interface 인터페이스명 { ... }

// 넓이 공식
// 삼각형 넓이 구하기 - Double 밑변, Double 높이 - > Double 삼각형 넓이
// 정사각형 넓이 구하기 - Double 변 - > Double 정사각형 넓이
// 직사각형 넓이 구하기 - Double 밑변, Double 높이 - > Double 직사각형 넓이
// 원 넓이 구하기 - Double 반지름 - > Double 원 넓이

interface AreaCalculation {
	
	public static final double PI = 3.14;

	public abstract double getTriangleArea (double bottom, double height);
	public abstract double getSquareArea (double side);
	public abstract double getRectangleArea (double bottom, double height);
	public abstract double getCurcleArea (double radius);
	
}

// 인터페이스는 implements 키워드를 이용해서 클래스에 구현해야함
class MyMath implements AreaCalculation {

	@Override
	public double getTriangleArea(double bottom, double height) {
		return bottom * height / 2 ;
	}

	@Override
	public double getSquareArea(double side) {
		return side * side;
	}

	@Override
	public double getRectangleArea(double bottom, double height) {
		return bottom * height;
	}

	@Override
	public double getCurcleArea(double radius) {
		return radius * radius * PI;
	}
	
}

// 제곱 공식만 바꾸고 싶을 때 : 위 코드 일부 내용을 수정하는 것이 아닌 다른 클래스 생성 후 수정하고 싶은 코드만 바꾼다
class MyMathV2 implements AreaCalculation {
	@Override
	public double getTriangleArea(double bottom, double height) {
		return bottom * height / 2 ;
	}

	@Override
	public double getSquareArea(double side) {
		return Math.pow(side, 2);
	}

	@Override
	public double getRectangleArea(double bottom, double height) {
		return bottom * height;
	}

	@Override
	public double getCurcleArea(double radius) {
		return radius * radius * PI;
	}
}


public class G_Interface {

	public static void main(String[] args) {
		
		//AreaCalculation instance = new MyMath(); 옆에 코드의 안정성 확인 후 밑에 코드 진행
		AreaCalculation instance = new MyMathV2();

	}

}
