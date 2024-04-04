import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
public static void main(String[] args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while(true){
        int n = Integer.parseInt(br.readLine());
        List<Integer> num = new ArrayList<Integer>();
        int sum = 0;

        if(n == -1){
            break;
        }
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                num.add(i);
            }
        }
        for(int i = 0; i<num.size()-1; i++){
            sum += num.get(i);
        }
        if(sum == n){
            System.out.print(sum + " = ");
            for(int j=0; j<num.size(); j++){
                System.out.print(num.get(j));
                if(j == num.size()-2){
                    System.out.println();
                    break;
                }
                else{
                    System.out.print(" + ");
                }
            }
        }
        else if(n != sum){
            System.out.println(n + " is NOT perfect.");
        }
    }
    }
}
