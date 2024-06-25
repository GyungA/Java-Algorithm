import java.io.*;
import java.util.StringTokenizer;

/*
 * 소수는 약수가 1과 자기자신뿐.
 * 1은 소수가 아니다.
 * 2를 제외한 짝수는 소수가 아니다.
 * 3부터 차례대로 나누다가, 자기자신이 오기 전에 약수가 또 나타나면 소수가 아니다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < total; i++) {
            int currentNum = Integer.parseInt(st.nextToken());

            if (currentNum == 2) {
                count++;
                continue;
            }

            if ((currentNum == 1) || (currentNum % 2 == 0)) {
                continue;
            }

            for (int j = 3; j <= currentNum; j+=2) {
                if (currentNum == j) {
                    count++;
                    continue;
                }
                if (currentNum % j == 0) {
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
