import java.util.ArrayList;
import java.util.Collections;

class Solution {
    static int X = 0;
    static int Y = 0;
    static int day = 0;
    static boolean[][] visited;
    static ArrayList<Integer> days = new ArrayList<>();
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public int[] solution(String[] maps) {
        X = maps.length; // 가로
        Y = maps[0].length(); // 세로
        int[][] mapArray = new int[X][Y];
        visited = new boolean[X][Y];

        for (int i = 0; i < X; i++) {
            char[] c = maps[i].toCharArray();
            for (int j = 0; j < Y; j++) {
                if (c[j] == 'X')
                    mapArray[i][j] = 0;
                else
                    mapArray[i][j] = c[j] - '0'; // 문자 => 숫자형으로 변환
            }
        }

        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                if (mapArray[i][j] > 0 && !visited[i][j]) {
                    DFS(mapArray, i, j);
                    days.add(day);
                    day = 0;
                }
            }
        }

        if (days.isEmpty()) {
            int[] answer = {-1};
            return answer;
        }

        Collections.sort(days);
        int[] answer = new int[days.size()];
        for (int i = 0; i < days.size(); i++) {
            answer[i] = days.get(i);
        }

        return answer;
    }

    public void DFS(int[][] maps, int x, int y) {
        visited[x][y] = true;
        day += maps[x][y];
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < X && ny < Y && maps[nx][ny] != 0 && !visited[nx][ny]) {
                DFS(maps, nx, ny);
            }
        }
    }
}
