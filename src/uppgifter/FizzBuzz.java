package uppgifter;

import java.util.Scanner;

public class FizzBuzz {
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in); 
	 
	 System.out.println("Skriv in tre siffror och se vilka som är delbara med den första och andra siffran i en sträcka som är så lång som den tredje siffran är.");
	 int Fizz = sc.nextInt();
	 
	 int Buzz = sc.nextInt();
	 
	 int N = sc.nextInt();
	 
	 for (int i = 1; i <= N; i++) {
		
		 if(i%Fizz==0 && i%Buzz==0){
			 System.out.println("FizzBuzz"); 
		 }
		 else if(i%Buzz==0){
			 System.out.println("Buzz");
		 }
		 else if(i%Fizz==0){
				System.out.println("Fizz");
		 }
		 else{
			 System.out.println(i);
		 }
	}
}

}
