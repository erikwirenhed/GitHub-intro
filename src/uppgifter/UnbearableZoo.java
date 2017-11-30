package uppgifter;

import java.util.Scanner;

public class UnbearableZoo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		String[]strarr= new String[0];
				
		for (int i = 0; i <= a; i++) {
			String c = sc.nextLine();
			
			String last = c.substring(c.lastIndexOf(" ")+1);
			strarr[i] = last; 
		}
		System.out.println(strarr[a]);
	}
}
