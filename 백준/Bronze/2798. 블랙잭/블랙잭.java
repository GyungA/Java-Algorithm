import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
 * 자연수 N, M을 받는다. N은 카드의 개수이고 M은 문제의 요건.
 * N개의 카드 중 세 개를 합쳐, M을 넘지 않는 M과 가장 가까운 수를 찾는다.
 * 3개씩 담는 모든 경우를 구하고, 그 각각의 합을 도출한다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        List<List<Integer>> combs = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    List<Integer> combination = new ArrayList<>();
                    combination.add(arr[i]);
                    combination.add(arr[j]);
                    combination.add(arr[k]);
                    combs.add(combination);
                }
            }
        }

        int result = Integer.MIN_VALUE;
        for (List<Integer> comb : combs) {
            int tempSum = 0;
            for (int i = 0; i < 3; i++) {
                tempSum += comb.get(i);
            }
            if ((tempSum > result) && (tempSum <= m)) {
                result = tempSum;
            }
        }

        System.out.println(result);
    }
}
