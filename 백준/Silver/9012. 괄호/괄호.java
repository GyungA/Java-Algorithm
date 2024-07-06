import java.io.*;
import java.util.Stack;

/*
 * 괜히 스택으로 한 번 더 풀기
 * (가 들어오면 '('를 넣는다.
 * )가 들어오면 '('를 뺀다.
 * 스택이 비어있는데 빼려고 하면 "NO"
 * 문자열이 끝났는데 스택이 비워지지 않았으면 "NO"
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String parenthesisString = br.readLine();
            Stack stack = new Stack();

            for (int j = 0; j < parenthesisString.length(); j++) {
                char currentChar = parenthesisString.charAt(j);
                if (currentChar == '(') {
                    stack.push('(');
                } else if (currentChar == ')') {
                    if (stack.empty()) {
                        result.append("NO\n");
                        break;
                    } else {
                        stack.pop();
                    }
                }

                if (j == parenthesisString.length() -1) {
                    result.append(stack.empty() ? "YES\n" : "NO\n");
                }
            }

        }

        System.out.println(result);
    }
}
