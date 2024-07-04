class Solution {
    public String solution(String s) {
    	int min = Integer.MAX_VALUE;
    	int max = Integer.MIN_VALUE;
    	String[] str = s.split(" ");
    	int[] arr = new int[str.length];
    	for(int i=0; i<str.length; i++)
    	{
    		arr[i] = Integer.parseInt(str[i]);
    		if(arr[i] < min)
    		{
    			min = arr[i];
    		}
    		if(arr[i] > max)
    		{
    			max = arr[i];
    		}		
    	}
    	 
        String answer = min+" "+max;
        
        return answer;
    }
}