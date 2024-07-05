import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/*
 * 회원 객체를 만든다. 필드는 인덱스, 나이, 이름.
 * 나이순, 나이가 같으면 가입한 순서로 정렬한다.
 * 나이와 이름을 출력한다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            User user = new User(i, Integer.parseInt(st.nextToken()), st.nextToken());
            users.add(user);
        }

        Collections.sort(users);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            User user = users.get(i);
            sb.append(user.age).append(" ").append(user.name).append("\n");
        }

        System.out.println(sb);
    }

    public static class User implements Comparable<User>{
        int index;
        int age;
        String name;

        User(int index, int age, String name) {
            this.index = index;
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(User user) {
            if (user.age == age) {
                return user.index < index ? 1 : -1;
            }
            return user.age < age ? 1 : -1;
        }
    }
}
