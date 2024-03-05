import java.util.Scanner;
import java.util.*;
public class Day2_addormultiply {

//각 자리가 숫자로만 이루어진 문자열S가 주어졌을 때, 왼쪽부터 오른쪽으로 하나씩 모든 숫자를 확인하며
//* 혹은 + 연산자를 넣어 결과적으로 만들어질 수 있는 가장 큰 수를 구하는 프로그램으로 작성하세요.
//모든 연산은 왼쪽에서부터 순서대로 이루어진다고 가정합니다.
	
//*idea: 0, 1을 제외한 모든 수는 곱하기가 더하기보다 유리함.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		/* 실행이 안되는데..?
		int sum=0;
		int intArray[] = new int[5];
		
		for(int i=0;i<5;i++) {
			intArray[i] = scanner.nextInt();
			
			sum = intArray[0];
			if(intArray[i]==0||intArray[i]==1) {
				sum+=intArray[i];
			}
			else
				sum*=intArray[i];
		
		}
		System.out.println("계산의 최댓값은: "+sum);
		*/
		
		String str = scanner.next();
		//첫 번째 문자를 숫자로 변강한 값을 대입
		long result = str.charAt(0)-'0';//'0'(char)=>48
		for(int i=1;i<str.length();i++) {
			//두 수 중에서 하나라도 '0'혹은 '1'인 경우, 곱하기보다는 더하기 수행
			int num = str.charAt(i) - '0';
			if(num<=1||result<=1) {
				result += num;
			}
			else {
				result *= num;
			}
		System.out.println(result);
			
			
		}
	}

}
