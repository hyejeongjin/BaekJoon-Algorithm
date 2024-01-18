import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        while(a > 999 || b > 999){
            System.out.println("a, b는 3자리 이하여야합니다.");

            a = sc.nextInt();
            b = sc.nextInt();

        }

        System.out.println(a*(b%10));
        System.lineSeparator();
        System.out.println(a*(b%100/10));
        System.lineSeparator();
        System.out.println(a*(b/100));
        System.lineSeparator();
        System.out.println(a*b);

        sc.close();
    }
}