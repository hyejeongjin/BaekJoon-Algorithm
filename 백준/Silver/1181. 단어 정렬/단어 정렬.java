import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<String> list = new ArrayList<>();

    for(int i=0; i<N; i++){
        list.add(sc.next());
    }

    //1.단어 중복 제거
    list = list.stream().distinct().collect(Collectors.toList());
    String[] arr = list.toArray(new String[list.size()]);
    
    //2.길이가 짧은 것부터 정렬
    Arrays.sort(arr);
    //3.길이가 같으면 사전 순으로
    for(int i=0; i<arr.length; i++){
        Arrays.sort(arr, (String s1, String s2) -> s1.length() - s2.length());
       
    }

    for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
    }

sc.close();
}
}