import java.io.*;

/*
 * F이면 0.0을 출력한다.
 * 첫 글자가 A이면 4.0을, B이면 3.0을, C이면 1.0을 입력한다.
 * 두번째 글자가 +이면 0.3을 더하고, -이면 0.3을 뺀다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] gradeChars = br.readLine().toCharArray();

        double result = 0;

        if (gradeChars[0] == 'F') {
            System.out.println("0.0");
            return;
        }

        switch (gradeChars[0]) {
            case 'A':
                result += 4.0;
                break;
            case 'B':
                result += 3.0;
                break;
            case 'C':
                result += 2.0;
                break;
            case 'D':
                result += 1.0;
                break;
        }

        switch (gradeChars[1]) {
            case '+':
                result += 0.3;
                break;
            case '-':
                result -= 0.3;
                break;
        }

        System.out.println(result);
    }
}