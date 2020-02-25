package ex3;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {

	// 인터페이스는 재정의를 해야 해서 pubilc으로 재정의 되어야 한다.
	String execute(HttpServletRequest request, HttpServletResponse response);
}
