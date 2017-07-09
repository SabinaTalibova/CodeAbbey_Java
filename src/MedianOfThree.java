import java.util.Scanner;

public class MedianOfThree {

	public static void main(String[] args) {
		//Problem Statement
		// Input data will contain in the first line the number of triplets to
		// follow.
		// Next lines will contain one triplet each.
		// Answer should contain selected medians of triplets, separated by
		// spaces.
		
		Scanner sc= new Scanner(System.in);
		
        int n=sc.nextInt();
        int [] arr= new int [3*n];
        for(int i=0;i<3*n;i++){
        	arr[i]=sc.nextInt();
        	
        }
        for(int i=0;i<arr.length-2;i+=3){
        	
        	if(arr[i]>arr[i+1]){
        		if(arr[i+1]>arr[i+2]) System.out.print(arr[i+1]+ " ");
        		else if (arr[i]>arr[i+2]) System.out.print(arr[i+2]+" ");
        		else System.out.print(arr[i]+" ");
        	
        		}
        	else{
        		if(arr[i]>arr[i+2]) System.out.print(arr[i]+ " ");
        		else if(arr[i+1]>arr[i+2]) System.out.print(arr[i+2]+" ");
        		else System.out.print(arr[i+1]+" ");
        	}
        		
        	}
        
        
	}

	}

