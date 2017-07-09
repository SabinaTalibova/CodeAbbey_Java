import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		//Problem Statement 
		//Input data are in the following format:
		//
		// first line contains N - the number of values to process;
		// and then N lines will follow describing the values for which sum of
		// digits should be calculated by 3 integers A B C;
		// for each case you need to multiply A by B and add C (i.e. A * B + C)
		// - then calculate sum of digits of the result.
		// Answer should have N results, also separated by spaces.
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int [] digits=new int[3*n];
		int [] modifs=new int[n];
		
		
		
		for(int i=0;i<3*n;i++){
			digits[i]=sc.nextInt();
		}
		
		
		
		for(int i=0;i<3*n-2;i+=3){
			int a=0;
			int sum=0;		
			
			a=digits[i]*digits[i+1]+digits[i+2];
			while(a>0){
						int e=a%10;
				sum=sum+e;
				a=a/10;
			}
			System.out.print(sum+" ");
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
