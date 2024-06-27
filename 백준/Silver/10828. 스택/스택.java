import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        Stack<Integer> intStack = new Stack<>();

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    intStack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(intStack.empty() ? "-1" : intStack.pop()).append("\n");
                    break;
                case "size":
                    sb.append(intStack.size()).append("\n");
                    break;
                case "empty":
                    sb.append(intStack.empty() ? "1" : "0").append("\n");
                    break;
                case "top":
                    sb.append(intStack.empty() ? "-1" : intStack.peek()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
