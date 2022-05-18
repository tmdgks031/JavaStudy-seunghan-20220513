package J04_입력;

import java.util.Scanner;

public class input04 {

	public static void main(String[] args) {
		/*
		 * 액션, 판타지, 모험 미국 126분 2022 .05.04 개봉 
		 * 샘 레이미
		 * [국내] 12세 관람가
		 * 누적관객 누적관객 도움말 4,987,963명(05.16기준)
		 * 지금껏 본 적 없는 마블의 극한 상상력!
		    광기의 멀티버스가 깨어난다.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		String A = null;
		String B = null;
		String C = null;
		int D = 0;
		String E = null;
		
		System.out.println("출력전 ");
		System.out.print("개요:");
		A = scanner.nextLine();
		System.out.print("감독:");
		B = scanner.next();
		scanner.nextLine();
		System.out.print("등급:");
		C= scanner.nextLine();
		System.out.print("흥행:");
		D = scanner.nextInt();
		scanner.nextLine();
		System.out.print("줄거리:");
		E = scanner.nextLine();
		
		System.out.println("닥터스트레인지2");
		System.out.println("개요:" + A);
		System.out.println("감독:" + B);
		System.out.println("등급:"+ C + "세 관람가");
		System.out.println("흥행: 누적관객"+ D + "명");
		System.out.println("줄거리:" + E);
				
	}

}
