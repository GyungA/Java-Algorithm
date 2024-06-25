import java.io.*;
import java.util.StringTokenizer;

/*
 * 한 줄씩 끊고, 토크나이저로 (a+b) 연산
 * 다음 토큰이 없으면 종료
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        do {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a + b).append("\n");
        } while (br.ready());

        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}