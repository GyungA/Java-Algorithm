import java.io.*;

/*
 * 스트링빌더에 1부터 30까지 담는다
 * 일치하는 스트링을 제거한다
 * 남은 스트링을 출력한다
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 30; i++) {
            sb.append(i).append("\n");
        }

        for (int i = 1; i <= 28; i++) {
            String submittedStudentNum = br.readLine().trim();
            int studentIdx = sb.indexOf(submittedStudentNum);
            if (Integer.parseInt(submittedStudentNum) >= 10) {
                sb.delete(studentIdx, studentIdx+3);
            } else {
                sb.delete(studentIdx, studentIdx+2);
            }
        }

        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}