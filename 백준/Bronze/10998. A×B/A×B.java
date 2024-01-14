import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        while(a < 0 || b > 10){
            System.out.println("a는 0 초과, b는 10미만으로 입력하세요!");
            
            a = sc.nextInt();
            b = sc.nextInt();
        }
        
        System.out.println(a*b);
        sc.close();
        
    }
}