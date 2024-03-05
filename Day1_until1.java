import java.util.Scanner;
//첫째 줄에 N(1<=N<=100000)과 K(2<=K<=100000)가 공백을 기준으로 하여 각각 자연수로 주어집니다.
//첫째 줄에 N이 1이 될 때까지 1번(1을 뺀다) 혹은 2번(K로 나눈다)의 과정을 수행해야 하는 횟수의 최솟값을 출력합니다.

public class Day1_until1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int result = 0;
		
		while(true) {
			//N이 K로 나누어 떨어지는 수가 될 때까지 뺴기
			int target = (N/K)*K;
			result += (N-target);
			N = target;
			//N이 K보다 작을 때 (더 이상 나눌 수 없을 떄) 반복문 탈출
			if(N<K) break;
			//K로 나누기
			result += 1;
			N/=K;
		}
		//마지막으로 남은 수에 대하여 1씩 빼기
		result += (N-1);
		System.out.println(result);
		
	}

}