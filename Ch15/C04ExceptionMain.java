package Ch15;

public class C04ExceptionMain {

	public static void main(String[] args) {
		
		try {
		String str = null;
		str.toString(); 	//NULL 예외발생
		
		int arr[] = {10,20,30};
		arr[5] = 100;		//Bound Exception 발생
	
		Integer.parseInt("a1234");	//Parse Exception 발생
		
		Animal animal = new Dog();
		Cat yummi =(Cat)animal; 	//Cast Exception 발생
		
//		} catch(NullPointerException e) {
//			System.out.println("NULL 예외발생 처리..");
//		} catch(ArrayIndexOutOfBoundsException e2) {
//			System.out.println("Arr Bounds예외발생 처리..");
//		} catch(NumberFormatException e3) {
//			System.out.println("Number Format Exception 예외발생 처리..");
//		} catch(ClassCastException e4) {
//			System.out.println("ClassCastException 예외발생 처리..");
//		}
		} catch(Exception e) {		// Exception의 하위 클래스를 다 예외처리
			System.out.println(e);
			} finally {
				System.out.println("무조건 실행되는 코드");	//예외가 발생하든 안하든
			}
		
		
		
		
		
	}

}
