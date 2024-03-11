package Ch10;

public class C03ArrayMain {
	// 1차원 배열 : 해당 자료형을 요소단위로 정한다.
	
	// 2차원 배열 : 1차원 배열을 요소단위로 정한다.
	// int arr[][] = new int[2][3]; // 
	public static void main(String[] args) {
		
		int arr[][] = {
			{10,20,30},
			{40,50,60,65,67},
			{70,80,90,11},
			{100,110,120,18,55,77},
	};
		System.out.println("길이"+ arr.length);		// 1차원 배열을 요소 단위로 가지므로 행의 갯수를 출력
		System.out.println("[0]행의 열의 길이 : " + arr[0].length);
		System.out.println("[1]행의 열의 길이 : " + arr[1].length);
		System.out.println("[2]행의 열의 길이 : " + arr[2].length);
		System.out.println("[3]행의 열의 길이 : " + arr[3].length);
 }
}
