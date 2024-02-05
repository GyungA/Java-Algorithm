//240129
import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int action = Integer.parseInt(st.nextToken());
            switch (action) {
                case 1:
                    int num = Integer.parseInt(st.nextToken());
                    stack.push(num);
                    break;
                case 2:
                    if (stack.empty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(stack.pop()).append('\n');
                    }
                    break;
                case 3:
                    sb.append(stack.size()).append('\n');
                    break;
                case 4:
                    if (stack.empty()) {
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }

                    break;
                case 5:
                    if (stack.empty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(stack.peek()).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
        br.close();
    }
}
