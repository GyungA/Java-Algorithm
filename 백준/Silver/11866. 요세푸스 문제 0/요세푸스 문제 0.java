import java.io.*;
import java.util.*;

/*
 * 1부터 N까지 HashSetA에 저장
 * Iterator를 생성하여, 다음 값이 존재할 동안 K번째 값을 계속 제거
 * 제거된 값은 StringBuilder에 순서대로 추가
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        LinkedHashSet<Integer> hashSetA = new LinkedHashSet();
        for (int i = 1; i <= n; i++) {
            hashSetA.add(i);
        }

        Iterator<Integer> iterA = hashSetA.iterator();

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        
        while (!hashSetA.isEmpty()) {
            int currentNum = 0;

            for (int i = 0; i < k; i++) {
                if (!iterA.hasNext()) {
                    iterA = hashSetA.iterator();
                }
                currentNum = iterA.next();
            }
            iterA.remove();
            sb.append(currentNum).append(", ");
        }

        sb.delete(sb.length() - 2, sb.length());
        sb.append(">");
        System.out.println(sb);
    }
}
