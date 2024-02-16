import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int[] student = new int[31];

        for(int i=1; i<29; i++){
            int num = Integer.parseInt(br.readLine());
            student[num] = 1;
        }
        for(int j=1; j<student.length; j++){
            if(student[j] != 1){
                System.out.println(j);
            }
        }
        br.close();
    }
}