import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        String[] msg = new String[T];

        for(int i=0; i<T; i++){
            msg[i] = br.readLine();
        }

        for(int i=0; i<msg.length; i++){
            System.out.print(msg[i].charAt(0));
            System.out.print(msg[i].charAt(msg[i].length()-1) + "\n");
        }
         
        br.close();
    }
}