import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //시험 본 과목의 개수
        int N = Integer.parseInt(br.readLine());

        int[] test = new int[N];

        double total = 0.0;

        //최댓값
        int max = -1000;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<test.length; i++){
            test[i] = Integer.parseInt(st.nextToken());

            max = Math.max(max, test[i]); 
        }
        for(int j=0; j<test.length; j++){
            total += test[j];
        }
        System.out.println((total/max*100)/N);
         
        br.close();
    }
}