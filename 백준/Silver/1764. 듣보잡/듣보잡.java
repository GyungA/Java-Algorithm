import java.io.*;
import java.util.*;

/*
 * n개의 이름을 Set에 저장한다. 이때 Array가 아닌 이유는 Array의 순차 탐색보다 Set의 해시테이블 랜덤 접근을 통한 조회가 더 빠르기 때문이다.
 * m개의 이름을 조회하며, n개의 이름에 있는 값이면 출력값에 담는다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // Set<String> givenSet = new HashSet(); -> 제네릭타입<> 명시해야함
        Set<String> givenSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            givenSet.add(br.readLine());
        }

        int count = 0;
        Set<String> resultSet = new HashSet<>();
        for (int i = 0; i < m; i++) {
            String current = br.readLine();
            if (givenSet.contains(current)) {
                count++;
                resultSet.add(current);
            }
        }

        // resultSet.stream().sorted(); -> set은 순서를 보장하지 않으며, 해당 메서드도 값을 직접 정렬하는 메서드가 아니다.
        // List<String> resultList = resultSet.stream().sorted().toList(); -> toList는 Java16부터 지원하며, 백준은 Java 11을 사용함.
        ArrayList<String> resultList = new ArrayList<>(resultSet);
        Collections.sort(resultList);

        StringBuilder sb = new StringBuilder();
        sb.append(count).append("\n");

        for (String s : resultList) {
            sb.append(s).append("\n");
        }

        /*
         * StringBuilder sbCount = new StringBuilder().append(count).append("\n");
         * sbCount.append(sb);
         *
         * 또 하나의 Set을 만들고, count를 저장한 StringBuilder를 만든 후에, 다시 Set을 돌면서 StringBuilder에 추가하는 방법도 있다.
         * 얼핏 보기엔 지금의 방법이 코드가 지저분해 보일 수 있어도, 사실 for문 하나가 빠진 거라 더 가볍다.
         */
        /*
         * -> 아니네. 사전순 출력인 걸 놓쳤다. 따로 저장하는 건 불가피하다.
         */

        System.out.println(sb);
    }
}
