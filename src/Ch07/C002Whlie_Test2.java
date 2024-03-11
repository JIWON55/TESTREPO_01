package Ch07;

import java.util.Scanner;

public class C002Whlie_Test2 {

	public static void main(String[] args) {
		//구구단 출력(2-9단)
//		int dan = 2;
//		int i;
//		while (dan<=9) {
//			i=1;
//			while(i<=9) {
//				System.out.printf("%d x %d =%d\n", dan, i, dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		//구구단 역순출력(2-9단)
//		int dan = 9;
//		int i;
//				
//		while (dan>=2) {
//			i=9;
//			while(i>=1) {
//				System.out.printf("%d x %d =%d\n", dan, i, dan*i);
//				i--;
//			}
//			System.out.println();
//			dan++;
//		}
				
		//구구단 출력(2-9단)
//		Scanner sc = new Scanner(System.in);
//	
//		
//		int n = sc.nextInt();
//		int i;
//		int dan=2; 
//		while (dan<=n) {
//			i=1;
//			while(i<=9){
//				System.out.printf("%d x %d =%d\n", dan, i, dan*i);
//				i++;
//				}
//				System.out.println();
//				dan++;
//			}
		
		

		//4행 별찍 -> 높이 입력 별찍기
		//행증가			별찍기(j)
		//0				0~3
		//1				0~3
		//2				0~3
		//3				0~3
	//------------------------------------------------
	//	i=0;			j=0
	//	i<4		 		j<4
	//	i++				j++
		
//		int i=0; //행증가
//		int j=0; //별찍기
//		while(i<4) {
//			
//			j=0;
//			while(j<4) {
//			System.out.println();
//			j++;
//			}
//			System.out.println("*");
//			i++;
//		}
		
		
		
		
		Scanner sc = new Scanner(System.in);
//		int i= 0; //행증가
//		int j= 0; //별찍기
//		int n=sc.nextInt();
//		while(i<n) {
//			
//			j=0;
//			while(j<4) {
//			System.out.println();
//			j++;
//			}
//			System.out.println("*");
//			i++;
//		}
		
		//반삼각 별찍기 (4행)
//		int i=0; //행증가
//		int j=0; //별찍기
//		while(i<4) {
//			
//			j=0;
//			while(j<=i) {
//			System.out.println();
//			j++;
//			}
//			System.out.println("*");
//			i++;
//		}
		
		
		//높이 받아서 반삼각별찍기
//		int i=0; //행증가
//		int j=0; //별찍기
//		int n = sc.nextInt();
//		while(i<n) {
//			
//			j=0;
//			while(j<=i) {
//			System.out.println();
//			j++;
//			}
//			System.out.println("*");
//			i++;
//		}
		
		
		//피라미드 별찍기
		// i(행)		j(공백)		k(별)
		// 0		0-2			0-0
		// 1		0-1			0-2
		// 2		0-0			0-4
		// 3		x			0-6
//--------------------------------------------
//		i=0			j=0			k=0
//		i<4			j<=2-i		k<=i*2
//		i++			j++			k++
		
//		int i=0;
//		int j=0;
//		int k=0;
//		
//		while(i<4) {
//			//공백
//			j=0;
//			while(j<2-i){
//				System.out.println(" ");
//				j++;
//			}
//			//별
//			k=0;
//			while(k<i*2){
//				System.out.println("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//역삼각형 별찍기
		
		// i(행)		j(공백)		k(별)
		// 0		X			0-6
		// 1		0-0			0-4
		// 2		0-1			0-2
		// 3		0-2			0-0
//-------------------------------------------
//		i=0			j=0			k=0
//		i<4			j<=i-1		k<=6-2i
//		i++			j++			k++
		
		
//		int i=0;
//		int j=0;
//		int k=0;
//		int n = sc.nextInt();
//		
//		while(i<n) {
//			//공백
//			j=0;
//			while(j<=i-1) {
//				System.out.println(" ");
//				j++;
//			}
//			//별
//			k=0;
//			while(k<=((n-1)-2*i)) {
//				System.out.println("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//마름모 별 찍기 높이 = 7
		// i(행)		j(공백)		k(별)
		// 0		0-2			0-0
		// 1		0-1			0-2
		// 2		0-0			0-4
		// 3		X			0-6
// ---------------------------------------(분기처리)		
		// 4		0-0			0-4
		// 5		0-1			0-2
		// 6		0-2			0-0
//-------------------------------------------
//		i=0			j=0			k=0
//		i<7			j<=2-i		k<=2*i
//		i++			j++			k++
// -------------------------------------------(4초과)		
//		i=0			j=0			k=0
//		i<7			j<=i-(n/2)-1		k<=((n-1)*2)-2*i
//		i++			j++			k++
		
		
		int i=0;
		int j=0;
		int k=0;
		int h = sc.nextInt();
		while(i<h) {
			if(i<(h/2)+1) {			// (i<=(h/2))
				//공백
				j=0;
				while(j<=(h/2-1)-i){
					System.out.println(" ");
					j++;
				}
				
				//별
			}else {
				//별
				
				//공백
			}
			
			System.out.println();
			i++;
			
			//공백

		}
		
	}

}
