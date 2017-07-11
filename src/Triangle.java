import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			// The triangle inequality states that the sum of the lengths of any
			// two sides of a
			// triangle must be greater than or equal to the length of the third
			// side.
			
			if(a<=b+c && b<=a+c && c<=a+b){
				System.out.print("1"+" ");
				
			}
			else System.out.print("0"+ " ");
		
		}

	}

}
