import java.io.*;
import java.util.*;

/*
 * 2번 사람은 1번을 기다린다.
 * 3번 사람은 1번, 2번을 기다린다.
 * ...
 * 즉, 기다리는 시간이 계속해서 쌓이기 때문에, 소요 시간이 짧을수록 앞에 있어야 총 시간이 짧아진다.
 * => 오름차순 정렬 후 누적해서 더한다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new PriorityQueue();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            queue.offer(Integer.parseInt(st.nextToken()));
        }

        // 첫번째 자리는 (count)번 더해지고, 더해지는 횟수가 1씩 줄어들다가, 마지막 자리는 1번 더해진다.
        int sum = 0;
        for (int i = 0; i < count; i++) {
            int current = queue.poll();
            sum += current * (count - i);
        }

        System.out.println(sum);
    }
}
