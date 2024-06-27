import java.io.*;
import java.util.StringTokenizer;

/*
 * M과 N을 입력받는다.
 * 왼쪽 위가 흰색일 때, 다시 칠해야 하는 개수를 구한다
 * 왼쪽 위가 검은색일 때, 다시 칠해야 하는 개수를 구한다.
 * 두 수 중 적은 수를 출력한다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        char[][] board = new char[M][N];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String currentLine = br.readLine();
            for (int j = 0; j < N; j++) {
                board[i][j] = currentLine.charAt(j);
                sb.append(board[i][j]);
            }
            sb.append("\n");
        }

        // 왼쪽 위부터 시작점을 옮겨가며, 8*8 사이즈로 반복
        int result = Integer.MAX_VALUE;
        for (int i = 0; i <= (M-8); i++) {
            for (int j = 0; j <= (N-8); j++) {
                result = Math.min(result, calcEachMin(i, j, board));
            }
        }
        System.out.println(result);
    }

    public static int calcEachMin(int m, int n, char[][] board) {
        // 흰색으로 시작
        int wCount = 0;
        for (int i = m; i < m+8; i++) {
            for (int j = n; j < n+8; j++) {
                if ((i % 2 != 0) && (j % 2 != 0)) {
                    if (board[i][j] != 'W') {
                        wCount++;
                    }
                }
                if ((i % 2 != 0) && (j % 2 == 0)) {
                    if (board[i][j] != 'B') {
                        wCount++;
                    }
                }
                if ((i % 2 == 0) && (j % 2 != 0)) {
                    if (board[i][j] != 'B') {
                        wCount++;
                    }
                }
                if((i % 2 == 0) && (j % 2 == 0)) {
                    if (board[i][j] != 'W') {
                        wCount++;
                    }
                }
            }
        }

        // 검은색으로 시작
        int bCount = 0;
        for (int i = m; i < m+8; i++) {
            for (int j = n; j < n+8; j++) {
                if ((i % 2 != 0) && (j % 2 != 0)) {
                    if (board[i][j] != 'B') {
                        bCount++;
                    }
                }
                if ((i % 2 != 0) && (j % 2 == 0)) {
                    if (board[i][j] != 'W') {
                        bCount++;
                    }
                }
                if ((i % 2 == 0) && (j % 2 != 0)) {
                    if (board[i][j] != 'W') {
                        bCount++;
                    }
                }
                if((i % 2 == 0) && (j % 2 == 0)) {
                    if (board[i][j] != 'B') {
                        bCount++;
                    }
                }
            }
        }

        return Math.min(wCount, bCount);
    }
}
