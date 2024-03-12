//in pseudocode...
//Input: A sequence of n numbers
//Output: A premutation(reordering) of the input sequence in an ascending order

/*Insertion-Sort(A,n)
for i=2 to n
 key = A[i]; -> 삽입할 대상(값)
 j = i-1 -> 현재 삽입할 대상인 key의 이전 위치
 while j>0 and A[j]>key
  A[j+1]=A[j]
  j=j-1
 A[j+1]=key -> key보다 큰 요소들을 한 칸씩 오른쪽으로 이동시킨 후, key를 그 자리(A[j+1])에 삽입
 */

import java.util.*;
public class Insertion_Sort {
	public static void insertion_sort(int[] A) {
		for(int i=1;i<A.length;i++) {
			int key = A[i];
			int j = i-1;
			while(j>=0 && A[j]>key) {
				A[j+1] = A[j];
				j = j-1;
			}
			A[j+1] = key;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("배열의 요소를 입력하세요.");
		for(int i=0;i<size;i++) {
			a[i] = sc.nextInt();
		}
		
		insertion_sort(a);
		
		System.out.println("삽입 정렬된 배열: ");
		for(int num : a) {
			System.out.print(num + " ");
		}
		//for-each문 (enhanced for loop):
		//배열 또는 컬렉션의 각 요소를 순회하며 처리할 때 사용
		//'a'의 각 요소를 'num'에 순차적으로 할당하여 반복한다는 의미
		//'a' 배열의 첫 번째 요소부터 마지막 요소까지 순차적으로 'num' 변수에 할당되면서 반복문이 실행.
		//이때 'num' 변수는 반복문 내에서 현재 처리 중인 요소를 나타냄.
		//요소의 값만 필요한 경우에는 for-each문 사용하는 것이 편리!
		
		sc.close();

	}

}
