import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[9];
        int max = -1000000;

        for(int i=0;i<9; i++){
            
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            num[i] = Integer.parseInt(st.nextToken());
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

        br.close();

    }
}