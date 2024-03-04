package Ch07;

import java.util.Scanner;

public class C00While_Test {

	public static void main(String[] args) {
		//문제
		// N - M 까지의 합을 구합니다.(N<M)
		
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int tmp = 0;
//		int sum = 0;
//		int i = n;
//		
//		
//		if(n>m) {
//			tmp=n;
//			n=m;
//			m=tmp;
//		}
//		
//		while(i<=m) {
//			sum += i;
//			i++;
//		}
//		System.out.printf("%d부터 %d까지의 합은 %d입니다", n,m,sum);
		
	
		//01 1 - N 까지 수중에 짝수/홀수의 합을 각각 출력
//		int N = sc.nextInt();
//		int i = 1;
//		int sum1 = 0;
//		int sum2 = 0;
//		while(i%2==0 && i<=N) {
//			sum1 += i;
//			i++;
//			
//		}
//		while(i%2!=0 && i<=N) {
//			sum2 += i;
//			i++;
//		}
//		System.out.println("1부터 " + N +"까지의 짝수의 합은 " + sum1 + "입니다.");
//		System.out.println("1부터 " + N +"까지의 홀수의 합은 " + sum2 + "입니다.");
		
		
		//1 - N 까지 수중에 3의 배수만 출력하고 그합도 출력
		
//		int N = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		while(i%3==0 && i<=N) {
//			System.out.println(i);
//			sum += i;
//			i++;
//		} 
//		System.out.println("1부터 " + N +"까지의 3의배수인 수의 합은 " + sum + "입니다.");
		
		
		
		
		
		//1 - N 까지 수중에 4의 배수만 출력하고 4의 배수가 아닌 나머지의 합도 출력
		
//		int N = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		while(i<=N) {
//			if(i%4==0) {
//				System.out.println(i);
//			} else {
//				sum += i;
//			}	i++;
//
//		} 
		
		
		
		
		
		
		
		
		//구구단 N단 역순 출력(N<=9)
		
		int N = sc.nextInt();
		int i = N;
		while (N<=9) {
			if(i<=N) {
			System.out.println(i*N);
			}
			i--;
		}
		
		
		//피라미드 별찍기
		System.out.println("높이 입력 : " );
		int n = sc.nextInt(); 
		int i = 0; 
		int j = 0; 
		int k = 0;
		
		
		
		for (i=0; i<n; i++) { 		//i가 0부터 시작해서 1,2,3 과정을 n보다 작을때까지만 반복 후 1씩 증가
			//공백
			for(j=0; j<(n-1)-i; j++) { // 1. j가 0부터 시작해서 (n-1)-i 보다 작을 때 까지만 공백 출력 후 1씩 증가
				System.out.print(" ");
			}
			//별
			for(k=0; k<(2*i)+1; k++) { // 2. k가 0부터 시작해서 2xi+1 보다 작을 때 까지만 * 출력 후 1씩 증가
				System.out.print("*");
				}
			System.out.println();	// 3. 개행
		}		
		
		
		
		
		
		
		
		
	}

}
