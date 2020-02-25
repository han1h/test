package ex4;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface TestAction {

	String execute(HttpServletRequest request, HttpServletResponse response);
	
}
