package Ch99;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		
		//피라미드 별찍기
				Scanner sc = new Scanner(System.in);
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
