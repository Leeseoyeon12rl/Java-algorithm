import java.util.*;

public class Day5_Time {
//정수 N이 입력되면 00시 00분 00초부터 N시 59분 59초까지의
//모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수를 구하는 프로그램을 작성하세요.

	//특정한 시각 안에 '3'이 포함되어 있는지의 여부
	public static boolean check(int h, int m, int s) {
			if(h%10==3||m/10==3||m%10==3||s/10==3||s%10==3)
				return true;
			return false;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int cnt = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<60;j++) {
				for(int k=0;k<60;k++) {
					//매 시각 안에 '3'이 포함되어 있다면 카운트 증가
					if (check(i,j,k)) cnt++;
				}
			}
		}
		System.out.println(cnt);
		
	}

}
