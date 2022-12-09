import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Human;

@WebServlet("/Sample7")
public class Sample7 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Sample7() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Human human = new Human("aaaaa", 23);
		request.setAttribute("human", human);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/sample7jsp.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
