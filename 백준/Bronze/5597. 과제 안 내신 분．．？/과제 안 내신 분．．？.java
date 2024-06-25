import java.io.*;

/*
 * 학생 수만큼 boolean 배열을 만든다
 * 제출되지 않은(false) 학생의 번호를 출력한다
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] submitted = new boolean[31];

        for (int i = 1; i <= 28; i++) {
            int submittedStudentNum = Integer.parseInt(br.readLine().trim());
            submitted[submittedStudentNum] = true;
        }

        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}
