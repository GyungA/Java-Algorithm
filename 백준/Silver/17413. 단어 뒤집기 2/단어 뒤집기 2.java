import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /* 한 줄을 입력받는다. 단어 단위로 끊는다.
            시작이 <이면 그대로 출력 문자열에 담는다.
            아니면 단어 단위로 한 글자씩 stack에 push했다가 다시 pop한다.
            => 태그와 단어 사이에 공백이 없어 잘못된 로직임 */
        /* 입력받는다. '<'나 ' '를 만날 때까지 스택에 담아 다시 꺼내고, '<'를 만나면 그대로 출력 문자열에 받는다.
            => while문이 세 개 또는 그 이상 사용됨
        */
        /* 입력받는다.
            <를 만나면 inTag를 켜고 이때까지의 임시문자열을 출력문자열에 뒤집어 넣고 턴다.
            >를 만나면 inTag를 끈다.
            inTag==true이면 단어를 그대로 넣는다
            inTag==false이면
                글자이면 임시 문자열에 넣는다
                공백이면 이때까지의 임시문자열을 출력문자열에 뒤집어 넣고 턴다.
            **순회하며 모두 사용하므로 Tokenizer보다 for each가 나음.
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();

        StringBuilder resultString = new StringBuilder();
        StringBuilder tempString = new StringBuilder();

        Boolean inTag = false;
        for (char c : inputString.toCharArray()) {
            if (c == '<') {
                inTag = true;
                resultString.append(tempString.reverse()); //append, reverse 메서드 사용
                tempString.setLength(0); //setLength 메서드 사용
                resultString.append(c);
            } else if (c == '>') {
                inTag = false;
                resultString.append(c);
            } else if (inTag) {
                resultString.append(c);
            } else {
                if (c == ' ') {
                    resultString.append(tempString.reverse());
                    tempString.setLength(0);
                    resultString.append(c);
                } else {
                    tempString.append(c);
                }
            }
        }

        resultString.append(tempString.reverse());
        
        System.out.println(resultString);
    }
}
