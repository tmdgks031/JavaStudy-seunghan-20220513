package J06_반복;

public class Star {

	public static void main(String[] args) {
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * 
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 *     
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********    
		 */
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
			for(int i=1 ; i<6 ; i++) {
				for(int j=0 ; j<6-i ; j++) {
					System.out.print(" ");
				}
				for(int j=0 ; j<i ; j++) {
					System.out.print("*");
				}		
			System.out.println();
			}
			for(int i = 1; i <= 5; i++) {
				for(int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 3-i; j++) {
					System.out.print(" ");
									}
			for(int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
			}
		
			
			}
		
			
			
		}

	
		
		
	


