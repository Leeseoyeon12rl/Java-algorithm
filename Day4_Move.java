import java.util.*;
public class Day4_Move {

//첫째 줄에 공간의 크기를 나타내는 N이 주어집니다.(1<=N<=100)
//둘째 줄에 여행가 A가 이동할 계획서 내용이 주어집니다.(1<=이동횟수<=100)
//첫째 줄에 여행가 A가 최종적으로 도착할 지점의 좌표(X,Y)를 공백을 기준으로 구분하여 출력합니다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		int N = sc.nextInt();
		int X = 0;
		int Y = 0;
		int direction = 4;
		String directionString = "";
		
		switch(direction) {
		case 1: directionString = "U";
		Y++;
		break;
		case 2: directionString = "D";
		Y--;
		break;
		case 3: directionString = "R";
		X++;
		break;
		case 4: directionString = "L";
		X--;
		break;
		}
		
		/*100개 입력받기를 기다려서 실행이 안되는 것
		String instruction[] = new String[100];
		for(int i=0;i<100;i++) {
			instruction[i] = sc.next();
		}
		String plan = sc.nextLine();
		//-> 통채로 저장되어 있으면 사용하기 불편하니까
		//split함수를 이용해서 " "(공백)을 기준으로 나누어서
		//배열에 저장하는 느낌이야
		String[] goal = plan.split(" ");
		//-> 이렇게 하면 goal[0] 이런식으로 해당 위치 값을
		//편하게 꺼내쓸 수 있어서..!
		System.out.println(X+" "+Y);
		*/
		
		//dx, dy 1차원 배열을 각각 선언하여 방향 설정
		//L,R,U,D를 갖고있는 String배열 선언
		//이중for문을 선언하여
		//바깥 for문에는 입력받은 이동방향을 element에 저장하고
		//안쪽 for문에서는 LRUD에 따른 방향 처리를 해준다.
		
		int n = sc.nextInt();
		sc.nextLine(); //버퍼 비우기
		String[] plans = sc.nextLine().split(" ");
		int x=1,y=1;
		
		//L,R,U,D에 따른 이동 방향
		int[] dx= {0,0,-1,1};
		int[] dy= {-1,1,0,0};
		char[] moveTypes = {'L','R','U','D'};
		
		//이동 계획을 하나씩 확인
		for(int i=0;i<plans.length;i++) {
			char plan = plans[i].charAt(0);
			//이동 후 좌표 구하기
			int nx=-1, ny=-1;
			for(int j=0;j<4;j++) {
				if(plan == moveTypes[j]) {
					nx = x + dx[j];
					ny = y + dy[j];
				}
			}
			//공간을 벗어나는 경우 무시
			if(nx<1||ny<1||nx>n||ny>n)continue;
			//이동 수행
			x = nx;
			y = ny;
		}
		
		System.out.println(x+" "+y);
		
		
	}

}
