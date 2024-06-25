import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int repeat = Integer.parseInt(st.nextToken());
            String input = st.nextToken();

            for (int j = 0; j < input.length(); j++) {
                for (int h = 0; h < repeat; h++) {
                    sb.append(input.charAt(j));
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
