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

		Student student = (Student)request.getAttribute("studentInfo");//in
		if (student.getNumber().length() == 0){
			student.addErrorMessage("学籍番号が入力されていません<br>");
		}
		if (student.getName().length() == 0){
			student.addErrorMessage("名前が入力されていません<br>");
		}
		if (student.getClas()==null){
			student.addErrorMessage("クラスが選択されていません<br>");
		}
		request.setAttribute("studentInfo", student);//out

		// フォワード処理
		RequestDispatcher dispatcher =request.getRequestDispatcher("/WEB-INF/varidateError.jsp");
		dispatcher.forward(request, response);
	}
}