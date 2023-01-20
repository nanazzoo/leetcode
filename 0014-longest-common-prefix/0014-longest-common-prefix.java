class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String answer = strs[0];
        
        for(int i=0; i<strs.length; i++) {
            while(strs[i].indexOf(answer) != 0) {
                
                answer = answer.substring(0, answer.length()-1);
            }
        }

        return answer;

    }
}