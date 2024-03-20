import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
public static void main(String[] args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());
    int C = 0;
    int q=0, d=0, n=0, p=0;

    for(int i=0; i<T; i++){
        C = Integer.parseInt(br.readLine());

        q = C/25;
        C = C%25;

        d = C/10;
        C = C%10;

        n = C/5;
        C = C%5;

        p = C;    

        
        System.out.println(q + " " + d + " " + n + " " + p);
    }

    br.close();
    }
}