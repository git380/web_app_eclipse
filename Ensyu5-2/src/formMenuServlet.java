import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class formMenuServlet
 */
@WebServlet("/formMenuServlet")
public class formMenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {

		// リクエストパラメータを取得
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("password");

		boolean invalid = true;

		// HTMLを出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		switch (id) {
		case "nagao":
			if (id.equals(pw)) {
				out.println("<!DOCTYPE html >");
				out.println("<html>");
				out.println("<head>");
				out.println("<meta charset=\"UTF-8\">");
				out.println("<title>講師用メニュー</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<p>授業編集<br>学生編集</p>");
				out.println("</body>");
				out.println("</html>");
				invalid = false;
			}
			break;

		case "utsumi":
			if (id.equals(pw)) {
				out.println("<!DOCTYPE html >");
				out.println("<html>");
				out.println("<head>");
				out.println("<meta charset=\"UTF-8\">");
				out.println("<title>学生用メニュー</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<p> 授業に参加</p>");
				out.println("</body>");
				out.println("</html>");
				invalid = false;
			}
			break;

		default:
			invalid = true;
			break;
		}

		if (invalid) {
			out.println("<!DOCTYPE html >");
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset=\"UTF-8\">");
			out.println("<title>入力エラー</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<p> 入力に誤りがあります<br>再入力してください<br></p>");
			out.println("</body>");
			out.println("</html>");
		}

	}
}