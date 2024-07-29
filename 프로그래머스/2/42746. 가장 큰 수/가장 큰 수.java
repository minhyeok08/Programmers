import java.util.*;
class Solution {
    public static String solution(int[] numbers) {
        String[] strNumbers = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strNumbers, new Comparator<String>() {
            
            @Override
            public int compare(String o1, String o2) {
                String order1 = o1 + o2;
                String order2 = o2 + o1;
                
                return order2.compareTo(order1); // 
            }
        });

        if (strNumbers[0].equals("0")) {
            
            return "0";
        }

        String answer = "";
        
        for (String number : strNumbers) {
            
            answer += number;
        }

        return answer;
    }
}