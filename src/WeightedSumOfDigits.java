import java.util.Scanner;

public class WeightedSumOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int c = 0;
			int sum=0;
			int orig = sc.nextInt();
			int a=orig;
			while (a > 0) {
				int m = a % 10;
				c++;
				a = a / 10;
			}
			
			while (orig > 0) {
				for(int j=c;j>0;j--){
				int s = orig % 10;
				sum=sum+s*j;
				orig = orig / 10;
				
			}
			}
			System.out.print(sum+ " ");
		
			}
			
		}

	}
