import java.util.*;
public class PrintNumInRev {
//    static void f(int i,int n){
//        if (i>n)
//            return;
//        System.out.println(n);
//        f(i,n-1);
//    }
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//
//        f(1,n);
//    }
    static void f(int i,int n){
        if(i<1)
            return;
        System.out.println(i);
        f(i-1,n);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt() ;
        f(n,n);
    }
}
