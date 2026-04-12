import java.util.*;
public class recur1toNnum {
    static void f(int i ,int N){
        if(i>N)
            return;
        System.out.println(i);
        f(i+1,N);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        f(1,N);
    }
}
