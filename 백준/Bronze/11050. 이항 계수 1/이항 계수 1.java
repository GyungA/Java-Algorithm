import java.io.*;
import java.util.StringTokenizer;

/*
 * 자연수 n, 정수 k를 받는다.
 * 이항계수: 주어진 n개의 원소 중에서 k개의 원소를 선택하는 방법의 수. n!/k!(n-k)!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(이항_계수(n, k));
    }

    static int 이항_계수(int n, int k) {
        int result = 1;

        for (int i = n; i >= 1; i--) {
            result *= i;
        }

        for (int i = k; i >= 1; i--) {
            result /= i;
        }

        for (int i = (n - k); i >= 1; i--) {
            result /= i;
        }

        return result;
    }
}
