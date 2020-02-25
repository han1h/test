package ex1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

/**
 * Servlet implementation class Controller1
 */
@WebServlet("/Controller1")
public class Controller1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// type이라는 파라미터 값을 받는다.
		String type = request.getParameter("type");
		
		/*
		 *  type의 값이 null이거나 "greet"이면 view1.jsp로 경로를 지정하고, 그렇지 않고 type의 값이 "hi"이면 view2.jsp로 경로를 지정하자
		 */
		
		// 이동할 경로를 저장할 변수!
		String viewPath = null;
		if(type == null || type.equals("greet")) {
			
			// 먼저 request에 "msg"라는 이름으로  "안녕하세요"를 저장하자!
			request.setAttribute("msg", "안녕하세요");
			
			// 뷰의 경로를 지정!
			viewPath = "/ex1/view1.jsp";
		}else if(type.equals("hi")) {
			
			request.setAttribute("msg", "nice meet u!");
			viewPath = "/ex1/view2.jsp";
		}else if(type.equals("hellow")) {
			request.setAttribute("str", "반갑습니다!");
			viewPath = "/ex1/view3.jsp";
		}
		
		// mvc에서 뷰 페이지 이동은 forward를 시킨다.
		RequestDispatcher disp = request.getRequestDispatcher(viewPath);
		
		disp.forward(request, response); // forward로 페이지 이동!
	}
}
