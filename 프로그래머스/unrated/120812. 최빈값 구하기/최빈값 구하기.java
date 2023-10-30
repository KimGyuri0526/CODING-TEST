import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Solution {
    public int solution(int[] array) {
        Map<String, Integer> map = Arrays.stream(array).mapToObj(i -> Integer.toString(i))
            .collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
      
        Integer max = Collections.max(map.values());
        int answer = 0;		  
        int cnt = 0;		    
        
        for (String key : map.keySet()) {
            if (map.get(key).equals(max)) {	      
                answer = Integer.parseInt(key);	  
                cnt++;
                if (cnt > 1) return -1;		       
            }
        }
        
        return answer;
    }
}