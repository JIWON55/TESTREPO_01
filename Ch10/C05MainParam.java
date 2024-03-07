package Ch10;

public class C05MainParam {

	public static void main(String[] args) {
		System.out.println("파라미터 배열 길이 : " + args.length);
		for(String param : args) {
			System.out.println(param);
		}
	}

}
