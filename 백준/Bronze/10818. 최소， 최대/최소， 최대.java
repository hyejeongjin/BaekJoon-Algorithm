import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        int max = -1000000;
        int min = 1000000;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0;i<n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=0; i<n; i++){
            max = Math.max(max, num[i]);
            min = Math.min(min, num[i]);
        }

        System.out.printf(min + " " + max);

        br.close();

    }
}