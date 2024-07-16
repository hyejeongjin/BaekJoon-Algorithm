import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());

    HashMap<String, String> map = new HashMap<String, String>();
    
    for(int i=0; i<N; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
        String name = st.nextToken();
        String sit = st.nextToken();
        
        if(map.containsKey(name)){
            map.remove(name);
        }else{
            map.put(name, sit);
        }
    }
    ArrayList<String> list = new ArrayList<String>(map.keySet());
    Collections.sort(list, Collections.reverseOrder());
    for(int i=0; i<list.size(); i++){
       bw.write(list.get(i) + "\n");
    }
    br.close();
    bw.flush();
    bw.close();
    
}
}