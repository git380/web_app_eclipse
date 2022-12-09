import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FowardEnterYourInfoServlet")
public class FowardEnterYourInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("/FowardUncheckedErrorServlet");
		if (request.getParameter("answer") != null) {
			if (request.getParameter("answer").equals("yes")) {
				// フォワード処理
				dispatcher = request.getRequestDispatcher("/WEB-INF/enterYourInfo.jsp");
				dispatcher.forward(request, response);
			} else {
				// リダイレクト
				response.sendRedirect("https://www.hi-joho.ac.jp/");
			}
		} else {//何もチェックされなかった場合
			dispatcher.forward(request, response);
		}
	}
}