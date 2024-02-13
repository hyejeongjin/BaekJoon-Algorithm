import java.util.*;

public class Main{
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);

        int[] num = new int[9];
        int max = -1000000;

        for(int i=0;i<9; i++){
            num[i] = sc.nextInt();
        }
        
        for(int i=0; i<9; i++){
            max = Math.max(max, num[i]);
        }

        System.out.println(max);

        for(int i=0; i<num.length; i++){
            if(num[i] == max){
                System.out.println(i+1);
            }
        }

        sc.close();

    }
}