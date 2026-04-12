import java.util.*;
public class PrintNumInRev {
    static void f(int i,int n){
        if (i>n)
            return;
        System.out.println(n);
        f(i,n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        f(1,n);
    }
}
