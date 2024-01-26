import java.util.*;
public class Main{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

        int h, m, oven;

    h = sc.nextInt();
    m = sc.nextInt();
    oven = sc.nextInt();
    if((m+oven)> 59){
        h += (m+oven)/60;
        m += oven;
        m %= 60;
        
        if(h > 23){
            h %= 24;
        }
    }else{
        h += (m+oven)/60;
        m += oven;
        m %= 60;
        
        if(h > 23){
            h %= 24;
        }
    }
    System.out.printf("%d %d",h, m);
    sc.close();
    }
}
