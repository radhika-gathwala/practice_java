import java.util.*;
class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<String>();
        
        for(int i = 0; i < emails.length; i++){
            String s = emails[i];
            String str = "";
            boolean b = false;
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == '.' && b == false){
                    j++;
                }
                if(s.charAt(j) == '+'){
                    for(int k = j; k < s.length(); k++){
                        j++;
                      if(s.charAt(k) == '@'){
                        b = true;
                        break;
                      }  
                    }
                }
                else{
                    str += s.charAt(j);
                }
                
                
                
            }
            set.add(str);
        }
        for (String s : set) {
            System.out.println(s);
        }
        return set.size();
        
    }
}