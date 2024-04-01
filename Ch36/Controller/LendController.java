package Ch36.Controller;

import java.util.Map;

public class LendController implements SubController{

	@Override
	public Map<String, Object> execute(int ServiceNo, Map<String, Object> params) {
		System.out.println("LendController's execute()");
		return null;
	}

}
