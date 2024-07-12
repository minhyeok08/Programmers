import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
    	
    	HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<genres.length; i++)
        {
        	map.put(genres[i], map.getOrDefault(genres[i], 0)+plays[i]);
        }
        ArrayList<String> genre = new ArrayList<>();
        for(String s : map.keySet())
        {
        	genre.add(s);
        }
        Collections.sort(genre, (o1, o2) ->  map.get(o2) - map.get(o1)); // 내림차순
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<genre.size(); i++)
        {
        	String genreName = genre.get(i);
        	int firstIdx = -1;	// 제일 큰 수 인덱스
        	int secondIdx = -1;	// 두번째 큰 수 인덱스
        	int max = Integer.MIN_VALUE;	// 제일 큰 수
        	int max2 = Integer.MIN_VALUE;	// 두번째로 큰 수
        	for(int j=0; j<plays.length; j++)
        	{
        		if(genreName.equals(genres[j]))
        		{
        			if(plays[j] > max)
        			{
        				max2 = max;	// 기존의 max 값을 max2로 밀기
        				max = plays[j];	// max 값 갱신
        				secondIdx = firstIdx; // max값과 동일하게 인덱스 처리
        				firstIdx = j;
        			}
        			else if(plays[j] > max2 && j != firstIdx )	// 두번째 큰 값 갱신 // 처음에 j=firstIdx가 같으므로 != 처리
        			{
        				max2 = plays[j];
        				secondIdx = j;
        			}
        				
        		}
        	}
        	list.add(firstIdx);
        	if(secondIdx >= 0)	// 앨범수록곡이 하나일 수 있으므로
        	list.add(secondIdx);
        }     
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++)
        {
        	answer[i] = list.get(i);
        }
        return answer;
    }
    
}
