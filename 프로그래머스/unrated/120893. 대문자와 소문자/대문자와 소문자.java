import java.util.regex.Pattern;
//import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.split("");
        String answer = "";
        
        for (String s : arr) {
            if (Pattern.matches("[a-z]*$", s)) answer += s.toUpperCase();
            if (Pattern.matches("[A-Z]*$", s)) answer += s.toLowerCase();
        }
        
        return answer;

    }
}