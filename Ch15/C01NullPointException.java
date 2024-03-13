package Ch15;

public class C01NullPointException {

	public static void main(String[] args) {
	
		try {
				String str=null; 
				System.out.println(str.toString());
		} catch(NullPointerException e) {
			//System.out.println("예외발생!" + e);
			//System.out.println(e.getCause());      // 원인표시
			//System.out.println(e.toString());
			//System.out.println(e.getStackTrace());
			e.printStackTrace();    //가급적이면 안쓰는게 좋다
		}
		
		System.out.println("HELLOWORLD");
		

	}

}
