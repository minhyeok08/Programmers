import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++)
        {
        	map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
        }
        for(int x : map.values())
        {
        	answer *= (x + 1);  // 각 의류의 안입는 경우 추가하여 x + 1 곱한다.
        }
        return answer - 1 ; // 모두 안 입는 경우 제거
    }
}