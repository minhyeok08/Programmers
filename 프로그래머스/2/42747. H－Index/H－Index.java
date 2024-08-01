import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations); // 내림차순
        int h = citations.length;
        
        for(int i=0; i<h; i++) {
        	int n = h - i; // 남은 논문수
        	if(citations[i] >= n) {
        		answer = n;
        		break;
        	}
        }
        return answer;
    }
}
 