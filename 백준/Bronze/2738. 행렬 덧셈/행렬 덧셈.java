import java.io.*;
import java.util.StringTokenizer;

/*
 * 행렬의 크기를 받는다
 * 두 개의 이중 배열을 만든다
 * 연산한다
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 배열 초기화
        int[][] arrayA = new int[n][m];
        int[][] arrayB = new int[n][m];

        // 배열 입력
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arrayA[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arrayB[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        br.close();

        // 행렬 연산
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(arrayA[i][j] + arrayB[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}