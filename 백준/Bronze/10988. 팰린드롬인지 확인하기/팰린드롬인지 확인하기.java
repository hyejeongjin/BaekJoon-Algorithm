import java.util.Scanner;

public class Main{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    String input = sc.next();
    int right = 1;

    for(int i=0; i<input.length()/2; i++){
        if(input.charAt(i) != input.charAt(input.length()-i-1)){
            right = 0;
        }
    }
    System.out.println(right);
    sc.close();
    }
}