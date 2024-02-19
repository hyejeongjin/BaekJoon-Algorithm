import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //시험 본 과목의 개수
        int N = sc.nextInt();

        int[] test = new int[N];

        double total = 0.0;

        //최댓값
        int max = -1000;

        for(int i=0; i<test.length; i++){
            test[i] = sc.nextInt();

            max = Math.max(max, test[i]); 
        }
        for(int j=0; j<test.length; j++){
            total += test[j];
        }
        System.out.println((total/max*100)/N);
         
        sc.close();
    }
}