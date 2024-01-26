class Solution {
    public String solution(String polynomial) {
        
        String[] arr = polynomial.replaceAll("\\bx", "1x").split(" \\+ ");
        int coe = 0;    
        int con = 0;    
        
        for (String s : arr) {
            if (s.contains("x")) {		                            
                coe += Integer.parseInt(s.replaceAll("x", ""));		
                continue;
            } else {					                                    
                con += Integer.parseInt(s);		                    
                continue;
            }
        }
        
        if (coe == 0) return "" + con;			                    
        if (coe == 1) return (con == 0) ? "x" : "x + " + con;	  
        if (con == 0) return coe + "x";			                  
        return coe + "x + " + con;			                        
    }
}
