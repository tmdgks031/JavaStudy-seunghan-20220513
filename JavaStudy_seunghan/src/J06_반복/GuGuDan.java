package J06_반복;

public class GuGuDan {

	public static void main(String[] args) {
		/*
		 * 2단부터 9단까지
		 */

		for(int dan = 0; dan < 8; dan++) {

			System.out.println( (dan+2) + "단" );
			
			for(int i = 0; i < 9; i++) {
				
				int result = (dan + 2) * (i + 1);
				System.out.println((dan + 2) + " x " + (i + 1) + " = " + result);
				
			}
			System.out.println();
		}
		
		
	}

}
