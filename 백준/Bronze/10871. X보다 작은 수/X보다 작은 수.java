import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" "); // 사용자 입력을 공백 기준으로 분리

        int n = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);

        String[] nums = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(nums[i]);
            if (currentNum < x) {
                sb.append(currentNum).append(" ");
            }
        }

        System.out.println(sb);
        br.close();
    }
}