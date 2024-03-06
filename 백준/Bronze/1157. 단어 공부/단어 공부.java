import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
public static void main(String[] args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] alpha = new int[26];

    String input = br.readLine().toUpperCase();

    for(int i=0; i<input.length(); i++){
        int num = input.charAt(i) - 65;
        alpha[num]++;
    }

    int max = -1;
    char ans = '?';

    for(int i=0; i<alpha.length; i++){
        if(max < alpha[i]){
            max = alpha[i];
            ans = (char)(i+65);
        }else if(max == alpha[i]){
            ans = '?';
        }
    }
    System.out.println(ans);
    br.close();
    }
}