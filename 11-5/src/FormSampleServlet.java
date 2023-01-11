import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormSampleServlet")
public class FormSampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {

		// リクエストパラメータを取得
		//request.setCharacterEncoding("UTF-8");
		String clas = request.getParameter("student-class");
		String name = request.getParameter("student-name");
		String number = request.getParameter("student-number");
		String gender = request.getParameter("student-gender");

		// リクエストパラメータをチェック
		StringBuilder errorMsg = new StringBuilder();
		if (clas == null || clas.length() == 0) {
			errorMsg.append("クラス名が入力されていません<br>");
		}
		if (name == null || name.length() == 0) {
			errorMsg.append("名前が入力されていません<br>");
		}
		if (number == null || number.length() == 0) {
			errorMsg.append("出席番号が入力されていません<br>");
		}
		if (gender == null || gender.length() == 0) {
			errorMsg.append("性別が選択されていません<br>");
		} else {
			if (gender.equals("0")) {
				gender = "男性";
			} 
			if (gender.equals("1")) {
				gender = "女性";
			}
		}

		// 表示するメッセージを設定
		String msg = clas + "クラス" + number + "番<br>" + gender + "<br>" + name
				+ "さんの得点を登録しました<br><table><th>科目</th><th>点数</th>";

		int i = 0;
		while (request.getParameter("score-" + i) != null) {//null(入力欄がない)じゃないあいだ繰り返す
			String subject = request.getParameter("score-" + i);
			if (subject.length() == 0) {
				errorMsg.append(i + 1).append("の点数が入力されていません<br>");
			} else {
				msg = msg + "<tr><td>" + (i + 1) + "科目目</td><td>" + subject + "</td></tr>";
			}
			i++;
		}

		// エラーを表示するメッセージを設定
		if (errorMsg.length() != 0) {
			msg = errorMsg.toString();
		}

		// HTMLを出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html >");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>ユーザー登録結果</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + msg + "</p>");
		out.println("</body>");
		out.println("</html>");
	}
}