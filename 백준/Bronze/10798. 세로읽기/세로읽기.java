import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
public static void main(String[] args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] list = new String[5];

    for(int i=0; i<5;i++){
        list[i] = br.readLine();
    }
    
    for(int i=0; i<15; i++){
        for(int j=0; j<5; j++){
            if(i<list[j].length()){
                System.out.print(list[j].charAt(i));
            }
        }
    }
    br.close();
    }
}