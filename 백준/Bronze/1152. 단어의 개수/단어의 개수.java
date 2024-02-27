import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
public static void main(String[] args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String sen = br.readLine();

    StringTokenizer st = new StringTokenizer(sen, " ");

    System.out.println(st.countTokens());
        br.close();
    }
}