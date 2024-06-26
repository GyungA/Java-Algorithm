import java.io.*;

/*
 * 1 (1) -> 출력값 1
 * 6 (2~7) -> 출력값 2
 * 12 (8~19) -> 출력값 3
 * 18 (20~37) -> 출력값 4
 * ...
 * 1이면 1을 출력한다.
 * 6*i를 계속 더한다. n을 넘을 때 index를 출력한다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if (num == 1) {
            System.out.println(1);
            return;
        }

        int i = 1;
        int currentSum = 1;
        while (currentSum < num) {
            currentSum += (6 * i);
            i++;
        }

        System.out.println(i);
    }
}
