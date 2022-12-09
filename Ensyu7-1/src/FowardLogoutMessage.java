

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FowardLogoutMessage
 */
@WebServlet("/FowardLogoutMessage")
public class FowardLogoutMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		session.removeAttribute("student");
		
		RequestDispatcher dispatcher =request.getRequestDispatcher("/WEB-INF/logoutMessage.jsp");
		dispatcher.forward(request, response);
	}
}