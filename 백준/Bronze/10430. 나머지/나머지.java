import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        while(a < 2 || b < 2 || c < 2 || a > 10000 || b > 10000 || c > 10000){
            System.out.println("a, b, c의 값은 2 이상 10000이하여야 합니다.");

            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }
        System.out.println((a+b)%c);
        System.lineSeparator();

        System.out.println(((a%c)+(b%c))%c);
        System.lineSeparator();

        System.out.println((a*b)%c);
        System.lineSeparator();
        
        System.out.println(((a%c)*(b%c))%c);
        sc.close();
    }
}