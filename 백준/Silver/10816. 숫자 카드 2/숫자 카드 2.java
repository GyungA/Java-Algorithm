import java.io.*;
import java.util.*;

/*
 * 정수 N을 받는다. N 사이즈의 배열에 숫자를 담는다.
 * 정수 M을 받는다. M 사이즈의 숫자는 따로 저장하지 않고 바로 확인한다.
 * 이중 for문을 돌린다: M개의 숫자를 돌면서 N개의 숫자 중 있는 개수를 확인해서, StringBuilder에 저장.
 *
 * -> 이중 for문이 최선인가..? -> Map 사용
 */

/*
 * 정수 N을 받는다. N 사이즈의 Map을 만든다.
 * 2번 줄을 돈다. 주어진 값이 Map에 있으면 Value++, 없으면 Value=1
 * 정수 M을 받는다. M개의 수를 돌면서 Map에서 Value를 조회해 출력문에 담는다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            Map<Integer, Integer> map = new HashMap();

            for (int i = 0; i < n; i++) {
                int current = Integer.parseInt(st.nextToken());
                map.put(current, (map.containsKey(current) ? map.get(current) + 1 : 1));
            }

            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m; i++) {
                int current = Integer.parseInt(st.nextToken());
                sb.append(map.containsKey(current) ? map.get(current) : 0).append(" ");
            }

            System.out.println(sb);
        }
    }
}
