import java.io.*;

/*
 * 대문자는 65부터 90까지. 소문자는 97부터 122까지. 각 개수는 26개.
 * 대문자이면(65~90) +=32
 * 소문자이면(97~122) -=32
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);

            if ((int) letter >= 65 && (int) letter <= 90) {
                char transformedLetter = (char) (letter + 32);
                sb.append(transformedLetter);
            } if ((int) letter >= 97 && (int) letter <= 122) {
                char transformedLetter = (char) (letter - 32);
                sb.append(transformedLetter);
            }
        }

        System.out.println(sb);
    }
}
