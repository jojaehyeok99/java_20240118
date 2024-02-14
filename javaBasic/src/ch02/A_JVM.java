package ch02;
// 엑셀로 jvm 구조 파악
class ExampleClass2 {
	static int number = 3;
	double doubleNumber;
	
//	void method() {
//		int localNumber = 0;
//	}
	
//	void method(int arg) {
//		arg++;
//		System.out.println("method in : " + arg);
//		
//	}
	
//	void method(Sample1 arg) {
//		arg.data++;
//		System.out.println("method in : " + arg.data);
//		
//	}
	
//	int method() {
//		int number = 99;
//		return number;		
//	}
	
	Sample1 method() {
		Sample1 sample = new Sample1();
		sample.data = -456;
		return sample;		
	}
		
	static void staticMethod() {
		
	}
	
}

class Sample1 {
	int data;
	
	Sample1 () {}
	
	Sample1 (Sample1 sample) {
		this.data = sample.data;
	}
}

public class A_JVM {

	public static void main(String[] args) {
		
		ExampleClass2 instance1 = new ExampleClass2();
		ExampleClass2 instance2 = new ExampleClass2();
		
		Sample1 sample = new Sample1();
//		sample.data = 0;
		sample.data = 8;
		
		int number = 0;
		instance1.doubleNumber = 9.9;
		
//		instance1.method();
//		instance1.method(number);
//		instance1.method(sample);
		
//		number = 10;
//		number = instance1.method();
		sample = instance1.method();
	
//		System.out.println(number);
//		System.out.println(sample.data);
//		System.out.println(sample.data);
		
		
		int number2 = number;
		number2++;
		System.out.println(number);
		System.out.println(number2);
		
		// 복사
		Sample1 sample2 = sample; // sample b주소 - 456 
		sample2.data++; // b = -455
		System.out.println("첫째 : " + sample.data);
		System.out.println("둘째 : " + sample2.data);
		
//		sample2 = new Sample1(sample);
//		System.out.println(sample.data);
//		System.out.println(sample2.data);
		
		Sample1 sample3 = new Sample1(sample);
		System.out.println(sample.data);
		System.out.println(sample3.data);
		sample3.data++;
		System.out.println(sample.data);
		System.out.println(sample3.data);
		
	}
}

