
import java.util.*;
class Solution {
	public int[] solution(int[] progresses, int[] speeds) {
		
		List<Integer> list = new ArrayList<>();
		Queue<Integer> Q = new LinkedList<>();
		int days = 0;
		for(int i=0; i<progresses.length; i++)
		{
			if((100 - progresses[i] ) % speeds[i] != 0)
			{
				days = (100 - progresses[i] ) / speeds[i] + 1;
			}
			else
			{
				days = (100 - progresses[i] ) / speeds[i];
			}
			Q.offer(days);
		}

		int dayCount = Q.poll();
		int cnt = 1;
		while(!Q.isEmpty())
		{	
			int now = Q.poll();
			if(dayCount >= now)
			{
				cnt++;
			}
			else
			{
				list.add(cnt);
				dayCount = now;
				cnt = 1;				
			}
		}
		list.add(cnt);
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i++)
		{
			answer[i] = list.get(i);
		}
		return answer;
	}
}