import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        
        System.out.println((int)str[0]);
                
    }
}