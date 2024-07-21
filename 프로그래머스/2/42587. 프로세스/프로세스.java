import java.util.*;

class T {
    int priority, location;
    T(int priority, int location) {
        this.priority = priority;
        this.location = location;
    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<T> Q = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            Q.offer(new T(priorities[i], i));
        }

        while (!Q.isEmpty()) {
            T cur = Q.poll();
            boolean check = false;
            
            for (T t : Q) {
                if (t.priority > cur.priority) {
                    check = true;
                    break;
                }
            }

            if (check) {
                Q.offer(cur);
            } 
            else {
                answer++;
                if (cur.location == location) {
                    return answer;
                }
            }
        }

        return answer;
    }
}