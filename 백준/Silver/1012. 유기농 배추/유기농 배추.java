import java.io.*;
import java.util.*;

/*
 * 테케 개수 T
 * 가로M, 세로N, 배추의 개수K
 * 배추의 x, y
 *
 * T번 큰 흐름 반복
 *   M*N의 배열. 0으로 채움.
 *   K번 반복
 *     (x, y)에 1 입력
 *
 * ---
 * DFS(재귀, 스택 -> 덩어리), BFS(큐 -> 최단 경로)
 * 여기서는 덩어리를 찾아야 하므로 DFS
 */

/* <1안: 시작지점 좌측 하단의 배추를 찾을 수 없는 문제>
 * 1을 찾는다. 1이 있으면 계속 오른쪽으로 간다. 방문한 곳을 표시하며 이동.
 * 끝나면 다시 왼쪽으로 가면서 아래쪽에 1이 있는지 확인.
 * 있으면 거기서 다시 오른쪽으로 간다. 방문한 곳을 표시하며 이동.
 * 끝나면 다시 왼쪽으로 가면서 아래쪽에 1이 있는지 확인.
 * 반복한다.
 */

/*  <2안>
 *  현재 위치에서 상하좌우 확인: (0, 1) (1, 0) (-1, 0) (0, -1)
 *  방문한 곳은 0으로 바꾸기
 *  위 네 방향에서 (0, -1)에 배추가 있다면 그 방향 다 탐색하고 돌아와서 (-1, 0)을 확인하면 됨.
 */
public class Main {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            // 기본 배열 생성
            int[][] arr = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    arr[i][j] = 0;
                }
            }

            // 배추 자리 표시
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[y][x] = 1;
            }

            // 지렁이 개수 세기
            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {
                    if (arr[y][x] == 1) {
                        count++;
                        dfs(x, y, arr);
                    }
                }
            }
            sb.append(count).append("\n");
            count = 0;
        }

        System.out.println(sb);
    }

    public static void dfs(int x, int y, int[][] arr) {
        if (x < 0 || y < 0 || y > arr.length - 1 || x > arr[0].length - 1) {
            return;
        }

        if (arr[y][x] == 1) {
            arr[y][x] = 0;
            // count++; --> 배추 셀 때마다 1 증가하는 거 아님.

            dfs(x + 1, y, arr);
            dfs(x - 1, y, arr);
            dfs(x, y + 1, arr);
            dfs(x, y - 1, arr);
        }

        /* 직접 스택을 만들 필요가 없다! 재귀 호출 시 호출 스택이 쌓임...
        Stack<Character> action = new Stack<>();

        if (arr[y][x] == 1) {
            if (y > 0) action.push('U'); // (0, -1)
            if (x > 0) action.push('L'); // (-1, 0)
            if (y < arr.length - 1) action.push('R'); // (1, 0)
            if (x < arr[0].length - 1) action.push('D'); // (0, 1) ---> 요런 것도 위에서 한 번에 처리!
        }
         */
    }

}




