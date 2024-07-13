import java.io.*;
import java.util.StringTokenizer;

/*
 * 두 수를 받아 int a, int b에 저장한다
 * 최대공약수: a, b 중 큰 수부터 1까지, 1씩 줄여가며 a, b에서 나눠본다. 양쪽 다 나눠떨어지면 최대공약수임.
 * 최소공배수: a, b 중 작은 수부터 두 수의 곱까지, 1씩 늘려가며 a, b에서 나눠본다. 양쪽 다 나눠떨어지면 최소공배수임.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int smaller = Integer.min(a, b);
        int bigger = Integer.max(a, b);

        int 최대공약수 = Integer.MAX_VALUE;
        for (int i = bigger; i >= 1; i--) {
            if ((a % i == 0) && (b % i == 0)) {
                최대공약수 = i;
                break;
            }
        }

        int 최소공배수 = 1;
        for (int i = smaller; i <= smaller * bigger; i++) {
            if ((i % a == 0) && (i % b == 0)) {
                최소공배수 = i;
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(최대공약수).append("\n").append(최소공배수);
        System.out.println(sb);
    }
}
