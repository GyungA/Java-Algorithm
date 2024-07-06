import java.io.*;

/*
 * int sum = 0;
 * 왼괄호를 만나면 sum++;
 * 오른괄호를 만나면 sum--;
 * 괄호가 끝나기 전에 sum < 0 이면 NO,
 * 괄호가 끝나고 나서 sum == 0 ? YES : NO
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            int sum = 0;
            String[] ps = br.readLine().split("");
            for (String p : ps) {
                sum = (p.equals("(")) ? ++sum : --sum;
                if (sum < 0) {
                    break;
                }
            }
            sb.append((sum == 0) ? "YES" : "NO").append("\n");
        }

        System.out.println(sb);
    }
}