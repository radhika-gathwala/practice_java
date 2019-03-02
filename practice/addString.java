class Solution {
    public String addStrings(String num1, String num2) {
        String result = "";
        int carry = 0;
        int i = num1.length() -1;
        int j = num2.length() - 1;
        while(i >= 0 || j >= 0 || carry != 0){
            int sum = carry;
            if(i>=0){
               sum+= (int)(num1.charAt(i))-'0';
                i--;
            }         
            if(j>=0){
                sum+=(int)(num2.charAt(j))-'0';
                j--;
            }
            int val = sum % 10;
            carry = sum /10; 
            result =  Integer.toString(val) + result;            
        }
        return result;
    }
}