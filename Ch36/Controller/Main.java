package Ch36.Controller;

import java.util.HashMap;
import java.util.Map;

import Ch36.Domain.Dto.BookDto;
   
public class Main {

	public static void main(String[] args) throws Exception{
		//01
//		FrontController frontController = new FrontController();
//		Map<String,Object> params = new HashMap();
//		params.put("bookDto",new BookDto(1111,"JAVA의 정석","EASY","111-111"));
//		frontController.execute("/book", 1, params);
//		System.out.println();
		
		//02
//		BookDaoImpl dao = new BookDaoImpl();
//		dao.Insert(new BookDto(1112,"JAVA의 정석-2", "EASY","111-111"));
//		dao.Insert(new BookDto(1113,"저도 잠오는데요..", "NOMAL","222-222"));
//		dao.Insert(new BookDto(1114,"할일이 많아요..", "HARD","333-333"));
		
		//03
//		

		//04
//		BookServiceImpl service = new BookServiceImpl();
//		List<BookDto> list = service.getAllBooks();
//		list.forEach(dto->{
//			System.out.println(dto);
//		});
		
		//05
		FrontController controller = new FrontController();
		Map<String,Object> params = new HashMap();
		params.put("bookDto",new BookDto(2222,"C의 정석","EASY","222-2222"));
		Map<String,Object>result = controller.execute("/book", 1, params);
		Object response = result.get("response");
	}

}
