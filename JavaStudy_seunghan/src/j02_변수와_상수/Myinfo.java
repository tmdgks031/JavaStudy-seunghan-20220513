package j02_변수와_상수;

public class Myinfo {

	public static void main(String[] args) {
		// 주석
		/*
		 * 메모,필기
		 * 
		 * 1.문제
		 * name1,name2, name3 (내이름)
		 * age(나이)
		 * phone(연락처)
		 * address(주소)
		 * 이름 : 신승한
		 * 나이 : 27
		 * 연락처 : 010-9605-6081
		 * 주소 : 포항시 양덕동 
		 */
		char name1 = '신';
		char name2 = '승';
		char name3 = '한';
		int age = 27;
		String phone = "010-9605-6081";
		String address = "포항시 양덕동";
		
		System.out.print("이름:");
		System.out.print(name1);
		System.out.print(name2);
		System.out.println(name3);
		System.out.print("나이:");
		System.out.println(age);
		System.out.print("연락처:");
		System.out.println(phone);
		System.out.print("주소:");
		System.out.println(address);
		
		System.out.print("이름: ");
		System.out.println(""+ name1 + name2 + name3); //16진수 AC01->10진수
		
		System.out.println("세수의 합:" + (10 + 20 + 30));
	}

}
