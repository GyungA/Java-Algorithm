import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// 피타고라스 정리 사용
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            ArrayList<Integer> arr = new ArrayList();
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < 3; i++) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            if ((arr.get(0) == 0) && (arr.get(1) == 0) && (arr.get(2) == 0)) {
                break;
            }

            Collections.sort(arr);

            int a = arr.get(0);
            int b = arr.get(1);
            int c = arr.get(2);

            if ((a * a + b * b) == c * c) {
                sb.append("right").append("\n");
            } else {
                sb.append("wrong").append("\n");
            }
        }
        System.out.println(sb);
    }
}
