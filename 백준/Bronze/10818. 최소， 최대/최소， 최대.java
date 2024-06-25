import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            int currentValue = Integer.parseInt(st.nextToken());
            if (currentValue > maxNum) {
                maxNum = currentValue;
            }
            if (currentValue < minNum) {
                minNum = currentValue;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(minNum).append(" ").append(maxNum);

        System.out.println(sb);
    }
}
