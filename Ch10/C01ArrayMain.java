package Ch10;

import java.util.Arrays;
import java.util.Scanner;

public class C01ArrayMain {
	//배열  -- 동적확장X -> 컬렉션으로 대체 가능
	//	   -- 동일한 자료형의 데이터를 저장하기 위해서 연속적인 저장공간을 할당하는 것
	//	   -- 동일한 데이터타입의 여러값들을 저장하기 위한 자료구조
	
	//1차원 / 2차원 / 다차원
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int[5];
		arr1[0] = sc.nextInt();
		arr1[1] = sc.nextInt();
		arr1[2] = sc.nextInt();
		arr1[3] = sc.nextInt();
		arr1[4] = sc.nextInt();
		
		System.out.println("배열길이 : " + arr1.length);
		System.out.println(arr1);  		// 배열의 주소값
		System.out.println(arr1 instanceof Object);
		System.out.println("----------------------------");
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("----------------------------");
//		for(int val : arr1) {
//			System.out.println(val);
//		}
//		System.out.println();
//		System.out.println("----------------------------");
//		Arrays.stream(arr1).forEach(System.out::println);
		int max = arr1[0];
		int min = arr1[0];
		for(int i=0; i<arr1.length; i++) {
			if (max<arr1[i]) {
				max = arr1[i];
			}
			if(min>arr1[i]) {
				min = arr1[i];
			
			}
			System.out.printf("MAX : %d MIN : %d\n", max,min);
			
			
			System.out.println(Arrays.stream(arr1).max().getAsInt());
			System.out.println(Arrays.stream(arr1).min().getAsInt());
			System.out.println(Arrays.stream(arr1).average().getAsDouble());
			
			double arr2[] = new double[5];
			
			
		}

	}

}
