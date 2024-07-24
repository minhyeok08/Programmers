import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        int truckOnBridgeWeight = 0;
        for(int i=0; i<truck_weights.length; i++)
        {
        	int curTruck = truck_weights[i];
        	while(true)
        	{
        		if(Q.isEmpty()) // 큐가 비어있는 경우
        		{
        			Q.offer(curTruck); // 현재 트럭을 큐에 넣고
        			answer++; // 시간 추가
        			truckOnBridgeWeight += curTruck; // 다리 위 트럭 무게 추가
        			break;
        		}
        		else // 큐(다리)에 트럭이 있는 경우
        		{
        			if(Q.size() == bridge_length) // 다리를 건너기 직전 트럭이 있는 경우
        			{
        				truckOnBridgeWeight -= Q.poll();
        			}
        			else if(curTruck + truckOnBridgeWeight <= weight) 
        				 // 다리위 무게와 대기 중인 트럭의 무게의 합이 weight를 넘지 않는 경우
        			{
        				Q.offer(curTruck);
        				truckOnBridgeWeight += curTruck;
        				answer++;
        				break;
        			}
        			else // weight를 넘는 경우
        			{
        				Q.offer(0); // 다리에 무게 0kg의 임의의 트럭을 넣고 기존의 트럭 밀어내기 
        				answer++;
        			}
        		}
        	}
        }
        return answer + bridge_length; // 마지막 남은 트럭이 poll되어야 하므로 다리 길이 만큼 추가
    }
}