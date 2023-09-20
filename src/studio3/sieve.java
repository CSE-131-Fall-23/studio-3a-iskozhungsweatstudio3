package studio3;

import java.util.Scanner;

public class sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//array from number 1 to n, n is user input
		//make a for loop for n
		//n%3, 5, 7, 2 = 0, then discard that number
		//print numbers n%x != 0
			
			Scanner in = new Scanner(System.in);
			System.out.println("Value for n: ");
			int n = in.nextInt();
			boolean[] sieveTotal = new boolean[n-1];
			
			for (int i = 0; i<(n+1); i++) {
				if (sieveTotal[i] == false){
					for (int j=i*i; j<(n+1); j=j+i) {
						sieveTotal[j] = true;
					}
				}
			
				
			
	}
			for (int i = 0; i<(n+1); i++) {
				if (sieveTotal[i] == false) {
					System.out.println(i);
				}
			}
}
}