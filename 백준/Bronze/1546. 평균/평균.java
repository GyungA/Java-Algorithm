import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        double[] scores = new double[count];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int highestScore = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            if (highestScore <= scores[i]) {
                highestScore = (int) scores[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < count; i++) {
            scores[i] = scores[i] / highestScore * 100;
            sum += scores[i];
        }

        System.out.println(sum / count);
    }
}
