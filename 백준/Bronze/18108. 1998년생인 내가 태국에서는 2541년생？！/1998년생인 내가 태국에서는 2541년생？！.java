import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        int y;

        y = sc.nextInt();

        while(y < 1000 || y > 3000){
            System.out.println("1000이상 3000이하로 다시 입력하세요!");
            
            y = sc.nextInt();
        }
        
        System.out.println(y - 543);

        sc.close();
    }
}