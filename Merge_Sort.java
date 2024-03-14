//in pseudocode...
//Divide and Conquer

/*Merge-Sort(A,p,r) p:시작 항 ,q:마지막 항
 * if p>=r
 *   return
 * q=(p+r)/2 이하 정수
 * Merge-Sort(A,p,q)
 * Merge-Sort(A,q+1,r)
 * Merge(A,p,q,r)
 * 
 * Merge(A,p,q,r)
 * nL = q-p+1 //length of A[p:q]
 * nR = r-q //length of A[q+1:r]
 * let L[0:nL-1] and R[0:nR-1] be new arrays 
 * for i=0 to nL-1 //copy A[p:q] into L[0:nL-1]
 *   L[i]=A[p+i]
 * for j=0 to nR-1 //copy A[q+1:r] into R[0:nR-1]
 *   R[j]=A[q+j+1]
 * i=0 //i indexes the smallest remaining element in L
 * j=0 //j indexes the smallest remaining element in R
 * k=p //k indexes the location in A to fill
 * As long as each of the arrays L and R contains an unmerged element,
 * copy the smallest unmerged element back into A[p:r].
 * while i<nL and j<nR
 *   if L[i]<=R[j]
 *     A[k]=L[i]
 *   else A[k]=R[j]
 *     j=j+1
 *   k=k+1
 * Having gone through one of L and R entirely, copy the
 * remainder of the other to the end of A[p:r].
 * while i<nL
 *   A[k]=L[i]
 *   i=i+1
 *   k=k+1
 * while j<nR
 *   A[k]=R[j]
 *   j=j+1
 *   k=k+1
 * 
 */

import java.util.*;

public class Merge_Sort {

	public static void mergeSort(int[] A, int p, int r) {
		if(p<r) {
			int q = (p+r)/2;
			mergeSort(A,p,q);
			mergeSort(A,q+1,r);
			merge(A,p,q,r);
		}
	}
	
	public static void merge(int[] A, int p, int q, int r) {
		int nL = q-p+1; //length of A[p:q]
		int nR = r-q; //length of A[q+1:r]
		int[] L = new int[nL];
		int[] R = new int[nR];
		
		//Copy A[p:q] into L[0:nL-1]
		for(int i=0;i<nL;i++) {
			L[i] = A[p+i];
		}
		
		//Copy A[q+1:r] into R[0:nR-1]
		for(int j=0;j<nR;j++) {
			R[j] = A[q+j+1];
		}
		
		int i=0,j=0,k=p;
		
		while(i<nL && j<nR) {
			if(L[i]<=R[j]) {
				A[k]=L[i];
				i++;
			} else {
				A[k]=R[j];
				j++;
			}
			k++;
		}
		
		//Copy the remainder of L or R to A[p:r]
		while(i<nL) {
			A[k]=L[i];
			i++;
			k++;
		}
		
		while(j<nR) {
			A[k]=R[j];
			j++;
			k++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("수열의 길이를 입력하세요: ");
		int n = scanner.nextInt();
		int[] a = new int[n];
		System.out.println("수열의 원소를 입력하세요: ");
		for(int i=0;i<n;i++) {
			a[i] = scanner.nextInt();
		}
		mergeSort(a,0,n-1);
		
		System.out.println("정리된 수열: ");
		for(int num : a) {
			System.out.print(num + " ");
		}
		scanner.close();

	}

}
