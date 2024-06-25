import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());

        for (int i = 0; i < total; i++) {
            String input = br.readLine();
            sb.append(input.charAt(0)).append(input.charAt(input.length()-1)).append("\n");
        }

        System.out.println(sb);
    }
}