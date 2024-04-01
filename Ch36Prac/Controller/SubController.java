package Ch36Prac.Controller;

import java.util.Map;

public interface SubController {
	Map<String,Object> execute(int ServiceNo, Map<String,Object> params);
}
