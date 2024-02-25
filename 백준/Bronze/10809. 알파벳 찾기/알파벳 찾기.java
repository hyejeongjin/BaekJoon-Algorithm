import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        for(int i=97; i<123; i++){
            System.out.printf("%d", S.indexOf(i));
            if(i != 123){
                System.out.print(" ");
            }
        }

        br.close();
    }
}