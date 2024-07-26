import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> queue = new LinkedList<>();

        for (int price : prices) {
            queue.offer(price);
        }

        int index = 0;
        while (!queue.isEmpty()) {
            int cur= queue.poll();
            int cnt = 0;

            for (int futurePrice : queue) {
                cnt++;
                if (cur > futurePrice) {
                    break;
                }
            }
            answer[index++] = cnt;
        }

        return answer;
    }
}