import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
    	int answer = 0;
    	int cnt = nums.length / 2;
    	HashMap<Integer, Integer> map = new HashMap<>();
    	for(int x : nums)
    	{
    		map.put(x, map.getOrDefault(x, 0)+1);
    	}
    	int len = map.size();
    	if(cnt <= len)
    		answer = cnt;
    	else
            answer = len;
        
        return answer;
    }
}