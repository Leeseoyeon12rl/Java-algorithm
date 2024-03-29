import java.util.*;
public class Day6_Chess {
//나이트는 이동할 때 L자 형태로만 이동할 수 있으며 정원 밖으로는 나갈 수 없습니다.
//이처럼 8*8좌표 평면상에서 나이트의 위치가 주어졌을 때 나이트가 이동할 수 있는 경우의 수를 출력
//행: 1~8, 열: a~h
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//현대 나이트의 위치 입력받기
		String inputData = sc.nextLine();
		int row = inputData.charAt(1) - '0';
		int column = inputData.charAt(0) - 'a' +1;
		
		//나이트가 이동할 수 있는 8가지 방향 정의
		int dx[] = {-2, -1, 1, 2, 2 ,1, -1, -2};
		int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};
		//8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
		int result = 0;
		for(int i=0;i<8;i++) {
			//이동하고자 하는 위치 확인
			int nextRow = row + dx[i];
			int nextColumn = column + dy[i];
			//해당 위치로 이동이 가능하다면 카운트 증가
			if(nextRow>=1 && nextRow<=8 && nextColumn>=1 && nextColumn<=8) {
				result += 1;
			}
		}
		System.out.println(result);
		
	}

}
