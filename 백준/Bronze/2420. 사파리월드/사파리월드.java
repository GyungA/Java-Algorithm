import java.io.*;
import java.util.StringTokenizer;

/*
 * 1. 0 < a < b then, sout(b-a)
 * 2. a < 0 < b then, sout(b + a*(-1))
 * 3. a < b < 0 then, sout(b-a)
 * 4. b < a < 0 then, sout(a-b)
 * 5. b < 0 < a then, sout(a + b*(-1))
 * 6. b < a < 0 then, sout(a-b)
 * => (a*b)가 양수이면 큰쪽 - 작은쪽.
 * => (a*b)가 음수이면 큰쪽 + 작은쪽*(-1).
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        if ((a*b) >= 0) {
            System.out.println(Math.max(a, b) - Math.min(a, b)); // int와 int의 연산 결과는 int.
            return;
        }
        System.out.println(Math.max(a, b) + (Math.min(a, b) * (-1)));
    }
}
