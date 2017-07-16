import java.util.Scanner;

public class ReverseString {
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		char [] charArr;
		charArr=str.toCharArray();
		for(int i=charArr.length-1;i>=0;i--){
			System.out.print(charArr[i]);
			
		}
		
		
	}
	

}
