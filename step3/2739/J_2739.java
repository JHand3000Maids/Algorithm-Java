import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());

        for(int i = 1; i < 10; i++){
            System.out.printf("%d * %d = %d\n", A, i, A * i);
        }
    }
}