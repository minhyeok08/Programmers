import java.util.Arrays;

class Solution {
    public int solution(int[][] targets) {
    	int answer = 0;
    	int cur = 0;
    	Arrays.sort(targets, (o1, o2) -> o1[1] - o2[1]);	// end 시간 기준 오름차순
    	for(int[] target : targets)
    	{
    		if(cur <= target[0]) {
    			cur = target[1];
    			answer++;
    		}    			
    	}
        
        return answer;
    }
}