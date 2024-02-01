import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        //x는 총 금액, n는 구매 물건 종류 수, a는 물건의 가격, b는 물건의 개수
        int x, n, sum=0;

        x = sc.nextInt();
        n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();

            sum += (a[i] * b[i]);
        }
        
        if(sum == x){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        sc.close();
    }
}
