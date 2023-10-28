import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int min = a * 60 + b + c;   
		a = (min / 60) % 24; 
		b = min % 60;			         
		
		System.out.println(a + " " + b);
		
		sc.close();
		
	}
}