import java.util.*;
public class gcdhcf {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter A for GCD:");
        int a= sc.nextInt();

        System.out.println("enter B for GCD:");
        int b= sc.nextInt();

        while(a>0 && b>0){
            if (a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
        if(a==0){
            System.out.println(b);
        }else {
            System.out.println(a);
        }
    }

}
