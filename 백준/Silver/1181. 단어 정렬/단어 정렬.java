import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main{
public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    List<String> list = new ArrayList<>();

    for(int i=0; i<N; i++){
        list.add(br.readLine());
    }
    //1.단어 중복 제거
    list = list.stream().distinct().collect(Collectors.toList());
    String[] arr = list.toArray(new String[list.size()]);  
    //2.사전순으로 정렬
    Arrays.sort(arr);   
    //3.길이 비교
    for(int i=0; i<arr.length; i++){
        Arrays.sort(arr, (String s1, String s2) -> s1.length() - s2.length());      
    }
    for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
    }
br.close();
}
}