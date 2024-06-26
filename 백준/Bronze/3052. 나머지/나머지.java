import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main{
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Integer[] num = new Integer[10];
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0; i<num.length; i++){
            num[i] = Integer.parseInt(br.readLine());
            set.add(num[i] % 42);
        }
        System.out.println(set.size());

        br.close();
    }
}