import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] arr = sc.next().toCharArray();
    String[] list = new String[arr.length];

    for(int i=0; i<arr.length; i++){
        list[i] = Character.toString(arr[i]);
    }
    Arrays.sort(list, Collections.reverseOrder());
    for(int i=0; i<arr.length; i++){
        System.out.print(list[i]);
    }
    sc.close();
    }
}
