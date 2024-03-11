package Ch06EXEC;

import java.util.Scanner;

public class PRAC {

	public static void main(String[] args) {
		//문제
		// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요

		Scanner sc = new Scanner(System.in);
		
//		int a = sc.nextInt();
//		
//		System.out.println("정수 하나를 입력하세요");
//		
//		if (a%3==0) {
//			System.out.println("a는 3의 배수 입니다.");
//		} 
//			System.out.println("a는 3의 배수가 아닙니다.");
//			
//			sc.close();
		
		
		//문제
		// 두수를 입력받아 두수 중에 큰수를 출력
		
		
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1>num2){
			System.out.println("두 수 중에 큰 수는 " + num1 + "입니다.");
		} else {
			System.out.println("두 수 중에 큰 수는 " + num2 + "입니다.");
		}
		
		sc.close();
		
		
		
		//문제
		// 세개의 정수를 입력받아 해당수의 합과 평균을 출력
		
		System.out.println("세개의 정수를 입력하세요");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int sum = n1+n2+n3;
		int avg = (n1+n2+n3)/3;
		System.out.println("세 정수의 합은 : " + sum + "입니다.");
		System.out.println("세 정수의 평균은 : " + avg + "입니다.");
		
		
		
		
		//문제
		// 세 정수를 입력받아 세 정수 중에 가장 큰수와 가장 작은수를 출력
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a>b && a>c) {
			System.out.println("가장 큰 수 : " + a);
			
		} else if(b>a && b>c) {
			System.out.println("가장 큰 수 : " + b);	
	
		} else {
			System.out.println("가장 큰 수 : " + c);
		} 
		
		if (a<b && a<c) {
			System.out.println("가장 작은 수 : " + a);
			
		} else if(b<a && b<c) {
			System.out.println("가장 작은 수 : " + b);	
	
		} else {
			System.out.println("가장 작은 수 : " + c);
		}
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		if(num%3==0)
//		{
//			System.out.println("3의 배수 : " + num);
//		}
//		System.out.println("프로그램을 종료합니다.");
		
		
		//문제
		// 두수를 입력받아 두수 중에 큰수를 출력
		
//		Scanner sc = new Scanner(System.in);
//		int n1=sc.nextInt();
//		int n2=sc.nextInt();
//		if(n1>n2)
//		{
//			System.out.println("큰 수 : " + n1);
//		}
//		else
//		{
//			System.out.println("큰 수 : " + n2);
//		}
		
	
		//문제
		// 세개의 정수를 입력받아 해당수의 합과 평균을 출력
		
//		Scanner sc = new Scanner(System.in);
//		int n1=sc.nextInt();
//		int n2=sc.nextInt();
//		int n3=sc.nextInt();
//		int sum=n1+n2+n3;
//		double avg=(double)sum/3;
//		System.out.printf("합 : %d 평균 : %.2f\n", sum,avg);
	
		
		
		
		
		
		//문제
		// 세 정수를 입력받아 세 정수 중에 가장 큰수와 가장 작은수를 출력

//		Scanner sc = new Scanner(System.in);
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int n3 = sc.nextInt();
//		
//		//n1이 제일 큰 경우
//		if(n1>=n2&&n1>=n3)
//		{
//			System.out.println("큰 수 : "+n1);
//		}
//		//n2이 제일 큰 경우
//		if(n2>=n1&&n2>=n3 &&((n2!=n1) && (n2!=n3)))
//		{
//			System.out.println("큰 수 : "+n2);
//		}
//		//n3이 제일 큰 경우
//		if(n3>=n1&&n3>=n2 &&(n3!=n1))
//		{
//			System.out.println("큰 수 : "+n3);
//		}
		
		
		
		
	
		//or
		
//		Scanner sc = new Scanner(System.in);
//		int n1=sc.nextInt(),n2=sc.nextInt(),n3=sc.nextInt();
//		if(n1>=n2&&n1>=n3)
//		{
//			System.out.println("큰수 : "+n1);
//		}
//		else if(n2>=n1&&n2>=n3){
//			System.out.println("큰수 : "+n2);
//		}
//		else {
//			System.out.println("큰수 : "+n3);
//		}
		
	
		
	}

}
