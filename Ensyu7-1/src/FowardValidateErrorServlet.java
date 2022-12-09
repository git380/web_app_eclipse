

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;

@WebServlet("/FowardValidateErrorServlet")
public class FowardValidateErrorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {

		Student student = (Student)request.getAttribute("student");//in
		if (student.getId().length() == 0){
			student.addErrorMessage("IDが入力されていません<br>");
		}
		if (student.getPassword().length() == 0){
			student.addErrorMessage("パスワードが入力されていません<br>");
		}
		request.setAttribute("studentInfo", student);//out

		// フォワード処理
		RequestDispatcher dispatcher =request.getRequestDispatcher("/WEB-INF/varidateError.jsp");
		dispatcher.forward(request, response);
	}
}