import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(queue.isEmpty() ? "-1" : queue.poll()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? "1" : "0").append("\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? "-1" : queue.peek()).append("\n");
                    break;
                case "back":
                    sb.append(queue.isEmpty() ? "-1" : queue.getLast()).append("\n");
                    // Queue 인터페이스는 getLast()를 사용할 수 없으므로 LinkedList로 형변환하거나 최초 선언을 LinkedList로 해야함.
                    break;
            }
        }

        br.close();
        System.out.println(sb);
    }
}
