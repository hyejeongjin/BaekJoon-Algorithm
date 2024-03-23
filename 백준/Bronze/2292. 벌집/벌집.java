import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
public static void main(String[] args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    
    int room = 1;
    int inc = 2;

    if(N == 1){
        System.out.println(room);
    }else{
        while(inc <= N){
            inc = inc + (6 * room);
            room++;
        }
        System.out.println(room);
    }
    br.close();
    }
}