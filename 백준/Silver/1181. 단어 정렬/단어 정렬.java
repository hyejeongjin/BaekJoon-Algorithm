import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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
    Arrays.sort(arr, new Comparator<String>() {
        @Override
        public int compare(String s1, String s2){
            if(s1.length() == s2.length()) {
                return s1.compareTo(s2);
            }else{
                return s1.length() - s2.length();
            }
        }    
    });
    for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
    }
br.close();
}
}