import java.io.*;
import java.util.*;

/*
 * Set에 저장해서 하나만 남긴다
 * 길이순, 길이가 같으면 알파벳순으로 정렬한다
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < count; i++) {
            set.add(br.readLine());
        }

        List<String> tempList = new ArrayList<>(set);
        tempList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
//                    return compare(o1, o2); --> 재귀 호출, 스택오버플로우 발생
                    return o1.compareTo(o2);
                } else return o1.length() - o2.length();
            }
        });

        StringBuilder sb = new StringBuilder();
        /*
        for (int i = 0; i < count; i++) { --> set에서 중복이 제거된 상태이므로 count와 개수가 일치하지 않음
            sb.append(tempList.get(i)).append("\n");
        }
         */
        for (String str : tempList) {
            sb.append(str).append("\n");
        }

        System.out.println(sb);
    }
}
