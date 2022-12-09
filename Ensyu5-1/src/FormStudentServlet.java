import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormStudentServlet")
public class FormStudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        // リクエストパラメータを取得
        request.setCharacterEncoding("UTF-8");
        String studentnumber = request.getParameter("studentnumber");
        String studentname = request.getParameter("studentname");
        String studentclass = request.getParameter("studentclass");

        // リクエストパラメータをチェック
        String errorMsg = "";
        if (studentnumber == null || studentnumber.length() == 0) {
            errorMsg += "学籍番号が入力されていません<br>";
        }
        if (studentname == null || studentname.length() == 0) {
            errorMsg += "名前が入力されていません<br>";
        }
        if (studentclass == null || studentclass.length() == 0) {
            errorMsg += "クラスが選択されていません<br>";
        } else {
            if (studentclass.equals("R3A1")) {
                studentclass = "R3A1";
            } else if (studentclass.equals("S2A1")) {
                studentclass = "S2A1";
            }
        }

        // 表示するメッセージを設定
        String msg = "学籍番号は「" + studentnumber + "」<br>名前は「" + studentname + "」<br>"
                + "クラスは「" + studentclass + "」<br><br>正常に登録しました";
        if (errorMsg.length() != 0) {
            errorMsg += "<br>※<font color=\"red\">入力に誤りがあります</font>※<br><br>再入力してください<br>";
            msg = errorMsg;
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