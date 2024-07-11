import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

/*
 * N개의 수를 받아 <N, false>로 해시맵에 저장
 * M개의 수를 받아 N에서 조회 후, 있으면 <N, true>로 수정
 * true, false에 따라 1, 0 출력
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> numN = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numN.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int currentNum = Integer.parseInt(st.nextToken());
            sb.append(numN.contains(currentNum) ? "1" : "0").append("\n");
        }

        System.out.println(sb);
    }
}
