import java.io.*;
import java.util.StringTokenizer;

/*
 * 정수 개수 만큼 반복문을 돈다
 * 주어진 정수와 같은 수가 나타나면 count++;
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int target = Integer.parseInt(br.readLine());

        for (int i=0; i<total; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == target) {
                count++;
            }
        }

        System.out.println(count);
    }
}