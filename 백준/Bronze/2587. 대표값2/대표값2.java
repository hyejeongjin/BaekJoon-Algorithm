import java.util.Arrays;
import java.util.Scanner;

public class Main{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int[] listArr = new int[5];
    int sum = 0;
    int avg = 0;

    for(int i=0; i<listArr.length; i++){
        listArr[i] = sc.nextInt();
    }
    
    Arrays.sort(listArr);
    for(int i=0; i<listArr.length;i++){
        sum += listArr[i];
        avg = sum/listArr.length;
    }
    System.out.println(avg);
    System.out.println(listArr[2]);
    sc.close();
    }
}
