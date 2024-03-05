import java.util.*;
import java.util.Arrays;
public class Day3_TravelGuide {
//총 모험가가 N명 있다. 공포도가 x인 모험가는 반드시 x명 이상으로 구성한
//모험가 그룹에 참여해야 한다. 여행을 떠날 수 있는 그룹 수의 최댓값은?
	
	public static int n;
	public static ArrayList<Integer> arrayList = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		/* 안 나와ㅜ
		//n명 입력
		int n = scanner.nextInt();
		//공포도 입력
		int num[] = new int[n];
		for(int i=0;i<n;i++) {
			num[i] = scanner.nextInt();
		}
		//입력받은 숫자 내림차순 정렬(1차원 int 배열 정렬)
		//배열 역순 -> primitive Type을 Wrapper클래스로 박싱해주어야 reverseOrder 사용가능
		Integer[] tmp = Arrays.stream(num).boxed().toArray(Integer[]::new);
		Arrays.sort(tmp, Comparator.reverseOrder());//내림차순
		
		
		//n명을 최고 숫자 순으로 나누기
		int team = 0;
			for(int j=0;j<n;j++) {
				if(n>0) {
				n=n-num[j];
				team+=1;}
				
				
			}
			
		System.out.println("결성된 그룹의 수는 "+team+"이다.");
		*/
		n = scanner.nextInt();
		
		for(int i=0;i<n;i++) {
			arrayList.add(scanner.nextInt());
		}
		Collections.sort(arrayList);//arrayList 리스트 정렬(작은 것부터)
		
		int result = 0;//총 그룹의 수
		int count = 0;//현재 그룹에 포함된 모험가의 수
		for(int i=0;i<n;i++) {//공포도를 낮은 것부터 하나씩 확인하여
			count+=1;//현재 그룹에 해당 모험가를 포함시키기
			if(count>=arrayList.get(i)) {//현재 그룹에 포함된 모험가의 수가 현재의 공포도 이상이라면, 그룹 결성
				result += 1;//총 그룹의 수 증가시키기
				count = 0;//현재 그룹에 포함된 모험가의 수 초기화
			}
		}
		System.out.println(result);
		

	}

}
