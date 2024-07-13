import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : completion)
        {
        	map.put(s, map.getOrDefault(s, 0)+1);
        }
        for(int i=0; i<participant.length; i++)
        {
        	if(map.getOrDefault(participant[i], 0) == 0) // 존재하지않으면 0값 처리
        	{
        		answer = participant[i];
        		break;
        	}
        	else
        	{
        		map.put(participant[i], map.get(participant[i]) - 1 );
        	}
        }
        return answer;
    }
}