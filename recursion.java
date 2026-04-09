import java.util.*;
public class recursion {
    static void recur(int count){
        if (count==3)
            return;
        System.out.println(count);
        count++;
        recur(count);
    }
    public static void main(String[] args){
    recur(0);
    }
}
