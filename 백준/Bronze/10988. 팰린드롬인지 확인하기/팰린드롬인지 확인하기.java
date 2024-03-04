import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
public static void main(String[] args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();
    StringBuilder sb = new StringBuilder(input);
    String diff = sb.reverse().toString();
    int right = 0;

    if(input.equals(diff)){
        right = 1;
    }

    System.out.println(right);
    br.close();
    }
}