import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;

@WebServlet("/FowardSelectPaymentServlet")
public class FowardSelectPaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {

		//フォワード処理で送る
		RequestDispatcher dispatcher;

		Student student = new Student();

		student.setStudent(request.getParameter("student-number"), request.getParameter("student-class"),
				request.getParameter("student-name"));
		request.setAttribute("studentInfo", student);

		if (student.getNumber().length() == 0 || student.getClas() == null || student.getName().length() == 0) {
			dispatcher = request.getRequestDispatcher("/FowardValidateErrorServlet");
		} else {//全て入力された
			// フォワード処理
			dispatcher = request.getRequestDispatcher("/WEB-INF/selectPayment.jsp");
		}
		dispatcher.forward(request, response);
	}
}