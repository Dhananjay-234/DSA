import java.util.*;

public class ReverseArrayUsingRecursion {
   static void f(int i,int arr[], int n){
       if(i>=n/2)
           return;
       int temp = arr[i];
       arr[i]= arr[n-i-1];
       arr[n-i-1]=temp;

       f(i+1,arr,n);

   }

   public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];

       for (int i=0;i<n;i++)
           arr[i]=sc.nextInt();

       f(0,arr,n);

       for(int i=0;i<n;i++)
           System.out.println(arr[i]+" ");

   }
}