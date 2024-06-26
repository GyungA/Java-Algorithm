import java.io.*;
import java.util.Arrays;

/*
 * 숫자를 배열에 담는다
 * 가장 작은 숫자부터 하나씩 새 배열에 담는다
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int[] orignArray = new int[count];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            orignArray[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(orignArray);
        for (int i = 0; i < count; i++) {
            sb.append(orignArray[i]).append("\n");
        }

        System.out.println(sb);
    }
}
