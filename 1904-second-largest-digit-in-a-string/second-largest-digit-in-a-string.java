class Solution {
    public int secondHighest(String s) {
        int max = -1;
        int secondMax = -1;

        for(int i=0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                int digit = ch - '0';

                if(digit > max){
                    secondMax = max;
                    max = digit;
                } else if(digit < max && digit > secondMax){
                    secondMax = digit;
                } 
            }
        }
        return secondMax;
}
}