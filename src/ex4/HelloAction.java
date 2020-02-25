package ex4;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloAction implements TestAction {

	@Override
	//@Override시간적 요소를 줄여 준다
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		// 인자로 받은 HttpservletRequest의 주소를 통해 자원을 저장할 수 있다.
		request.setAttribute("str", "MVC연습");
		
		// forward될 jsp문서의 경로를 반환
		return "/ex4/test1.jsp";
	}

}
