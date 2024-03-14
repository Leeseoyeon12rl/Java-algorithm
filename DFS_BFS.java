import java.util.*;
public class DFS_BFS {

	/* 스택
	 * import java.util.*;
	 * public class Main{
	 * public static void main(String[] args){
	 * Stack<Integer> s = new Stack<>();
	 * s.push(5);
	 * s.push(2);
	 * s.push(3);
	 * s.push(7);
	 * s.pop();
	 * s.push(1);
	 * s.push(4);
	 * s.pop();
	 * while(!s.empty()){
	 * System.out.print(s.peek()+" ");
	 * s.pop();
	 * }
	 * }
	 * }
	 * 
	 * 큐
	 * import java.util.*;
	 * public class Main{
	 * public static void main(String[] args){
	 * Queue<Integer> q = new LinkedList<>();
	 * q.offer(5);
	 * q.offer(2);
	 * q.offer(3);
	 * q.offer(7);
	 * q.poll();
	 * q.offer(1);
	 * q.offer(4);
	 * q.poll();
	 * while(!q.isEmpty()){
	 * System.out.print(q.poll()+" ");
	 * }
	 * }
	 * }
	 * 
	 * 
	 * 재귀함수(Recursive Function)
	 * -팩토리얼 함수
	 * 
	 * 
	 * 
	 * 
	 * DFS
	 * - 깊이 우선 탐색.
	 * - 스택 자료구조(혹은 재귀함수) 이용.
	 * 1. 탐색 시작 노드를 스택에 삽입하고 방문 처리를 함.
	 * 2. 스택의 최상단 노드에 방문하지 않은 인접한 노드가 하나롣 있으면
	 *    그 노드를 스택에 넣고 방문처리를 함.
	 *    방문하지 않은 인접 노드가 없으면 스택에서 최상단 노드를 꺼냄.
	 * 3. 더 이상 2번의 과정을 수행할 수 없을 때까지 반복함.
	 * 
	 * public static boolean[] visited = new boolean[9];
	 * public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	 * 방문처리를 위해 boolean 객체를 9개 포함하는 리스트를 초기화
	 * 그래프를 표현할 때는 2차원 배열 대신에 ArrayList를 중첩해서 사용
	 *->DFS 함수 정의
	 *public static void dfs(int x){
	 *-현재 노드를 방문 처리
	 *visited[x] = true;
	 *System.out.print(x + " ");
	 *-현재 노드와 연결된 다른 노드를 재귀적으로 방문
	 *for(int i=0;i<graph.get(x).size();i++){
	 *int y = graph.get(x).get(i);
	 *if (!visited[u] dfs(y);
	 *}
	 *}
	 *public static void main(String[] args){
	 *-그래프 연결된 내용 생략
	 *dfs(1)
	 *}
	 *}
	 * 
	 * 
	 * BFS
	 * - 너비 우선 탐색. 그래프에서 가까운 노드부터 우선적으로 탐색하는 알고리즘.
	 * - 큐 자료구조 이용.
	 * 1. 탐색 시작 노드를 큐에 삽입하고 방문 처리를 함.
	 * 2. 큐에서 노드를 꺼낸 뒤에 해당 노드의 인접 노드 중에서 방문하지 않은
	 *    노드를 모두 큐에 삽입하고 방문처리
	 * 3. 더 이상 2번의 과정을 수행할 수 없을 때까지 반복함.
	 * 
	 * import java.util.*;
	 * public class Main{
	 * pubic static boolean[] visited = new boolean[9];
	 * public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	 * -BFS 함수 정의
	 * public static void bfs(int start){
	 * Queue<Integer> q = new LinkedList<>();
	 * q.offer(start);
	 * -현재 노드를 방문 처리
	 * visited[star] = true;
	 * -큐가 빌 때까지 반복
	 * while(!q.isEmpty()){
	 * -큐에서 하나의 원소를 뽑아 출력
	 * int x = q.poll();
	 * System.out.print(x+" ");
	 * -해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
	 * for(int i=0;i<graph.get(x).size();i++){
	 * int y = graph.get(x).get(i);
	 * if(!visited[y]){
	 * q.offer(y);
	 * visited[y] = true;
	 * }
	 * }
	 * }
	 * }
	 * -메인 함수 생략
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
