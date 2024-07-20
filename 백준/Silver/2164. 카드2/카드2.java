import java.io.*;
import java.util.*;

/*
 * 정수 N을 받는다.
 * 1부터 N까지 Queue에 담는다.
 * 한 장을 버리고, 한 장을 위에서 아래로 옮기기를 반복한다.
 * '버리기' 단계에서 버린 후 카드가 한 장 남으면 멈추고 남은 수를 출력한다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList();

        for (int i = 1; i <= max; i++) {
            queue.offer(i);
        }

        int result = 1; // 기본값: N = 1인 경우.
        while (queue.size() > 1) {
            queue.poll();
            result = queue.poll();
            queue.offer(result);
        }

        System.out.println(result);
    }
}
