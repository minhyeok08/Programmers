class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(chars[i] == 'p')
                p++;
            if(chars[i] == 'y')
                y++;
        }
        if(p != y)
            answer = false;
        if(p == 0 && y ==0)
            answer = true;
        
        return answer;
    }
}