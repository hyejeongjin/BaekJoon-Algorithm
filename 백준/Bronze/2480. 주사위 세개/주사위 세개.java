import java.util.*;
public class Main{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

        int a, b, c, money, max;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        
        sc. close();

        if(((a == b) && (a == c) && (b == c))){
            money = 10000+(a)*1000;
            System.out.println(money);
        }else if(((a == b) || (a == c))){
            money = 1000+(a)*100;
            System.out.println(money);  
        }else if(((b == c))){
            money = 1000+(b)*100;
            System.out.println(money); 
        }else{
            max = Math.max(Math.max(a, b), c);
           money = max * 100;
           System.out.println(money);
        }
    }
}
