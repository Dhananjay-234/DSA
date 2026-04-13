import java.util.*;
public class SumOfFirstNnum {
    static void  f(int i, int sum){
        if (i<1){
            System.out.println(sum);
                return;
        }

        f(i-1,sum+i);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        f(n,0);
    }
}
//Parameterised