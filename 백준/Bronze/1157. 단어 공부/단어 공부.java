import java.util.Scanner;

public class Main{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int[] alpha = new int[26];

    String input = sc.next().toUpperCase();

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
    sc.close();
    }
}