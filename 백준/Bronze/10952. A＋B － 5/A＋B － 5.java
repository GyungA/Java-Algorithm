import java.io.*;
import java.util.StringTokenizer;

/*
 * 한 줄씩 끊고, 토크나이저로 (a+b) 연산
 * 두 수 모두 양수이므로, (a+b)==0 이면 스트링빌더에 담지 않고 종료
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if ((a+b) == 0) {
                System.out.println(sb.substring(0, sb.length()-1));
                return;
            }

            sb.append(a+b).append("\n");
        }
    }
}

