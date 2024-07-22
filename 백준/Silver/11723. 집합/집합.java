import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

/*
 * HashSet S를 선언한다.
 * count 값을 받는다.
 * count 값 만큼 for문을 돌며 명령을 수행한다.
 */
public class Main {
    static HashSet<Integer> set = new HashSet(); // static 할? 말? -> 현재 main에서만 쓰이기 때문에 static이 없어도 별 차이는 없지만, 하나의 변수를 계속 공유해야 한다는 면에서 static이 있는 게 정확하다.
    static StringBuilder sb = new StringBuilder(); // static 할? 말?
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "add" : add(Integer.parseInt(st.nextToken())); break; // switch 문에서 break 빼먹지 말 것
                case "remove" : remove(Integer.parseInt(st.nextToken())); break;
                case "check" : check(Integer.parseInt(st.nextToken())); break;
                case "toggle" : toggle(Integer.parseInt(st.nextToken())); break;
                case "all" : all(); break;
                case "empty" : empty(); break;
            }
        }

        System.out.println(sb);
    }

    static void add(int x) { // static 할? 말? -> 해야 함. main이 static 메서드이므로 main에서 호출되는 다른 변수와 메서드도 static이어야 필요한 시점에 메모리 할당이 일어난다.
        set.add(x); // set의 add는 중복삽입해도 하나만 남음
    }

    static void remove(int x) {
        set.remove(x); // set의 remove는 있을 때만 동작함
    }

    static void check(int x) {
        sb.append(set.contains(x) ? "1" : "0").append("\n");
    }

    static void toggle(int x) {
        if (set.contains(x)) {
            set.remove(x);
        } else {
            set.add(x);
        }
    }

    static void all() {
        // set = setAll; -> setAll을 미리 선언해두고 갖다 쓰는 경우, 같은 메모리 주소를 참조하게 되어 두번째 all 작동부터 문제가 발생함. clone을 써서 별도 메모리를 갖는 방법도 있는데 불필요한 부하 발생.
        set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
    }

    static void empty() {
        set.clear();
    }
}
