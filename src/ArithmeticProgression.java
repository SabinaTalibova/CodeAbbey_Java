import java.util.Scanner;

public class ArithmeticProgression {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++){
			int result=0;
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			
			int [] arr= new int[c];
			for(int j=1;j<c;j++){
				arr[0]=a;
				arr[j]=arr[j-1]+b;
				
				result=result+arr[j];
			}
			result=result+arr[0];
			
			System.out.print(result+" ");
			
		}

	}

}
