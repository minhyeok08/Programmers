import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
    	List<Integer> ans = new ArrayList<>();
        Queue<Integer> Q = new LinkedList<>();
        for(int x : arr)
        {
        	Q.offer(x);
        }
        int before = Q.poll();
        ans.add(before);
        while(!Q.isEmpty())
        {
        	int cur = Q.poll();
        	if(before != cur)
        	{	       		
        		ans.add(cur);
        		before = cur;
        	}
        
        }        
    	int[] answer = new int[ans.size()];
    	for(int i=0; i<ans.size(); i++)
    	{
    		answer[i] = ans.get(i);
    	}
        return answer;
    }
}