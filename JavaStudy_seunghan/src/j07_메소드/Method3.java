package j07_메소드;

// 메소드 오버로딩

public class Method3 {

	public static void test1() {
		System.out.println("매개변수가 없는 test1 호출");
	}
	
	public static void test1(int num) {
		System.out.println("int자료형 매개변수가 하나인 test1 호출");
	}
	
	public static void test1(int num,int num2) {
		System.out.println("int자료형 매개변수가 둘인 test1 호출");
	}
	
	public static void test1(double a) {
		System.out.println("double자료형 매개변수가 하나인 test1 호출");
	}
	
	public static void test1(int num, double dNum) {
		System.out.println("int자료형 다음에 double자료형 매개변수가 둘인 test1 호출");
	}
	
	public static void test1(double num, int dNum) {
		System.out.println("double자료형 다음에 int자료형 매개변수가 둘인 test1 호출");
	}
	
	
	public static void main(String[] args) {
		test1();
		test1(10);
		test1(10, 20);
		test1(3.14);
		test1(3,3.1);
		test1(3.3,1);
	
		
	}

}
