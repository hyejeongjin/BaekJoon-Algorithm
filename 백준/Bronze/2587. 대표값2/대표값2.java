import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
public static void main(String[] args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] listArr = new int[5];
    int sum = 0;
    int avg = 0;

    for(int i=0; i<listArr.length; i++){
        listArr[i] = Integer.parseInt(br.readLine());
    }
    
    Arrays.sort(listArr);
    for(int i=0; i<listArr.length;i++){
        sum += listArr[i];
        avg = sum/listArr.length;
    }
    System.out.println(avg);
    System.out.println(listArr[2]);
    br.close();
    }
}
