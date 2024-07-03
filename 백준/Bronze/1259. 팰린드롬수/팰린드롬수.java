import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        while (true) {
            String input = br.readLine();

            if (input.equals("0")) {
                break;
            }
            StringBuilder sb = new StringBuilder(input);
            String reversed = sb.reverse().toString();
            result.append(input.equals(reversed) ? "yes" : "no").append("\n");
        }
        System.out.println(result);
    }
}
