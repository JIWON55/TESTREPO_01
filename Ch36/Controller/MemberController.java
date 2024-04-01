package Ch36.Controller;

import java.util.Map;

public class MemberController implements SubController{

	@Override
	public Map<String, Object> execute(int ServiceNo,Map<String, Object> params) {
		System.out.println("MemberController's execute()");
		return null;
	}

}
