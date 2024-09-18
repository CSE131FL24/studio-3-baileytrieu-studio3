package studio3;

import java.util.Scanner;

public class sieve {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int limit;
		

		System.out.println("Give me a limit");
		limit = scan.nextInt();
		
		boolean[] array = new boolean[limit];
		
		for (int i = 2; i < array.length; i++) {
			array[i] = true;
		}
		
		for (int x = 2; x < array.length; x++) {
			if (array[x]) {
				for (int v = x*x ; v < array.length; v+=x) {
					(array[v]) = false; 
						
					
				}
			}
		}
			
		for (int i = 0; i < array.length; i++) {
			if(array[i] == true) {
				System.out.print(i + " ");
			}
		}
		
	}

}
