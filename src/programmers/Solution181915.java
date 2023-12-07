package programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/181915
// 글자 이어 붙여 문자열 만들기
/* 문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다.
 my_string의 index_list의 원소들에 해당하는
 인덱스의 글자들을 순서대로 이어 붙인 문자열을
 return 하는 solution 함수를 작성해 주세요.
 */
public class Solution181915 {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index_list.length; i++) {
            sb.append(my_string.charAt(index_list[i]));
        }
        return sb.toString();
    }
}
