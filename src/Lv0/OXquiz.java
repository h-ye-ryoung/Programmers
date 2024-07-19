package Lv0;

//2. OX 퀴즈

import java.util.*;

// 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
// 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.

public class OXquiz {
    public String[] solution(String[] quiz) {

        String[] resultArr = new String[quiz.length];

        for(int i=0; i<quiz.length; i++) {
            int firstIndex = quiz[i].indexOf(" ");
            int firstNum = Integer.parseInt(quiz[i].substring(0, firstIndex));

            String calc = quiz[i].substring(firstIndex+1, firstIndex+2);

            String tempstr = quiz[i].substring(firstIndex+3);


            int lastIndex = tempstr.indexOf(" ");
            int lastNum = Integer.parseInt(tempstr.substring(0, lastIndex));

            int resultIndex = quiz[i].lastIndexOf(" ");
            int resultNum = Integer.parseInt(quiz[i].substring(resultIndex+1, quiz[i].length()));

            if (calc.equals("+")) {
                int result = firstNum + lastNum;
                if (result == resultNum) {
                    resultArr[i] = "O";
                } else {
                    resultArr[i] = "X";
                }
            } else if (calc.equals("-")) {
                int result = firstNum - lastNum;
                if (result == resultNum) {
                    resultArr[i] = "O";
                } else {
                    resultArr[i] = "X";
                }
            }
        }

        String[] answer = resultArr;
        return answer;
    }
}
