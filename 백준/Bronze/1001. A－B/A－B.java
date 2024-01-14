import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        while(a < 0 || b > 10){
            System.out.println("a값은 0 초과, b 값은 10 미만이어야 합니다!");
            
            a = sc.nextInt();
            b = sc.nextInt();
        }
            System.out.println(a - b);
            sc.close();
    }
}