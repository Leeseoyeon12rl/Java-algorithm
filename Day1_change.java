import java.util.Scanner;

//당신은 음식점의 계산을 도와주는 점원입니다.
//카운터에는 거스름돈으로 사용할 500원, 100원, 50원, 10원짜리 동전이 무한히 존재한다고 가정합니다.
//손님에게 거슬러 주어야 할 돈이 N원일 때 거슬러 주어야 할 동전의 최소 개수를 구하시오.
//단, 거슬러 주어야 할 돈 N은 항상 10의 배수입니다.

public class Day1_change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("거스름돈: ");
		int change = scanner.nextInt();
		
		/*System.out.println("500원: "+change/500+"개");
		change = change%500;
		System.out.println("100원: "+change/100+"개");
		change = change%100;
		System.out.println("50원: "+change/50+"개");
		change = change%50;
		System.out.println("10원: "+change/10+"개");
		*/
		
		int cnt = 0;
		int[] coinTypes = {500, 100, 50, 10};
		for(int i=0;i<4;i++) {
			cnt+=change/coinTypes[i];
			change%=coinTypes[i];
		}
		System.out.println(cnt);

	}

}
