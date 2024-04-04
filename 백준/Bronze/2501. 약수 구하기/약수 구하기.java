import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int K = sc.nextInt();
    List<Integer> num = new ArrayList<Integer>();

    for(int i=1; i<=N; i++){
        if(N % i == 0){
            num.add(i);
        }
    }
    num.sort(Comparator.naturalOrder());
    if(num.size() < K){
        System.out.println(0);
    }
    else{
        System.out.println(num.get(K-1));
    }
    sc.close();
    }
}
