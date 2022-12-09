import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Student;

@WebServlet("/FowardMenuServlet")
public class FowardMenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {

		Student student = new Student(request.getParameter("id"),request.getParameter("password"));
		request.setAttribute("student", student);

		HttpSession session = request.getSession();
		session.setAttribute("student", student);

		RequestDispatcher dispatcher;
		if (student.getId().length() == 0 || student.getPassword().length() == 0) {
			// フォワード処理
			dispatcher = request.getRequestDispatcher("/FowardValidateErrorServlet");
		} else {//全て入力された
			// フォワード処理
			dispatcher =request.getRequestDispatcher("/WEB-INF/menu.jsp");
		}

		System.out.println(request);
		System.out.println(response);

		dispatcher.forward(request, response);
	}
}