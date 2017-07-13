import java.util.Scanner;
public class ArrayCounter{

     public static void main(String []args){
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       int [] arr= new int[m];
       for(int i=0;i<n;i++){
           int a=sc.nextInt();
           for(int j=0;j<m;j++){
               if(a==j+1){
                   arr[j]++;
               }
               
           }
       }
       for(int i=0;i<m;i++){
           System.out.print(arr[i]+" ");
       }
       
     }
}
