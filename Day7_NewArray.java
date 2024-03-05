import java.util.*;
public class Day7_NewArray {
//알파벳 대문자와 숫자(0~9)로만 구성된 문자열이 입력으로 주어집니다.
//이때 모든 알파벳을 오름차순으로 정렬하여 이어서 출력한 뒤에
//그 뒤에 모든 숫자를 더한 값을 이어서 출력합니다.

	//ArrayList는 배열과 다르게 동적 크기 할당 가능, 배열은 모든 타입을 담을 수 있지만
	//ArrayList는 객체만 가능(int와 같은 기본타입은 오류. int를 담고 싶으면 Integer 객체를 선언해야 함.
	//조회, 검색이 빠르고 삽입, 삭제는 비효율적.
	//AbstractList 추상 클래스를 상속.
	//ArrayList는 배열과 동일하게 인덱스로 객체를 관리(따라서 연속된 메모리 공간을 할당받음.)하고 크기를 동적으로 변경할 수 있음.
	//배열은 중간의 객체가 삭제되면 빈 공간으로 남아 있지만 ArrayList는 뒤 객체를 앞으로 이동시킴. 추가되면 이후의 객체들을 뒤로 이동시킴.
	//객체가 삽입, 삭제될 때마다 데이터가 이동하므로 삽입, 삭제에는 비효율적임.
	public static ArrayList<Character> result = new ArrayList<Character>();
	public static int value = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		
		//문자를 하나씩 확인하며
		for(int i=0;i<string.length();i++) {
			//알파벳인 경우 결과를 리스트에 삽입
			if(Character.isLetter(string.charAt(i))) {
				//boolean isLetter(char ch) : returns true if the passed character is really a character
				result.add(string.charAt(i));
			}
			//숫자는 따로 더하기
			else {
				value += string.charAt(i) - '0';
			}
		}
		
		//알파벳을 오름차순으로 정렬
		Collections.sort(result);
		
		//알파벳을 차례대로 출력
		for(int i = 0;i<result.size();i++) {
			System.out.print(result.get(i));
		}
		
		//숫자가 하나라도 존재하는 경우 가장 뒤에 출력
		if(value!=0) System.out.print(value);
		System.out.println();
		
	}

}
