import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //영어단어
        String S = br.readLine();

        int i = Integer.parseInt(br.readLine());
        i = i-1;

        System.out.println(S.charAt(i));
         
        br.close();
    }
}