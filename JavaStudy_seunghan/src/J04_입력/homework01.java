package J04_입력;

import java.util.Scanner;

public class homework01 {
/*
 * year=1999 
 * 4의배수 100의배수가아님 400의배수
 * 
 */
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("값 입력: ");
		int num = scanner.nextInt();
		System.out.println("입력한 값: " + num);
	
		
		String result = num % 4 ==0 
				&& num % 100 !=0 
				|| num % 400 == 0? "참 ":"거짓";
		System.out.println(result);
		
		
	}

}
