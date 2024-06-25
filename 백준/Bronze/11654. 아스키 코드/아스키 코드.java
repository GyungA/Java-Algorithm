import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char inputChar = br.readLine().charAt(0);

        System.out.println((int) inputChar);
    }
}

