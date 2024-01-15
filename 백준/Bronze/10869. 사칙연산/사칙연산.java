import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        while(a <0 || b >10001){
            System.out.println("a는 1이상, b는 10000 이하로 입력해주세요!");
            
            a = sc.nextInt();
            b = sc.nextInt();
        }
        System.out.println(a+b);
        System.lineSeparator();
        
        System.out.println(a-b);
        System.lineSeparator();
        
        System.out.println(a*b);
        System.lineSeparator();
        
        System.out.println(a/b);
        System.lineSeparator();
        
        System.out.println(a%b);
        sc.close();
    }
}