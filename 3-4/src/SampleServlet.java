

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SampleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	    // 運勢を決定
	    String[] luckArray = { "超スッキリ◇　[(・∀・)ｲｲﾈ!!]", "スッキリ◇　[!(^^)!]", "最悪◇　[(。´･ω･)?]" };
	    int index = (int) (Math.random() * 3);
	    String luck = luckArray[index];

	    // 実行日取得
	    Date date = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
	    String today = sdf.format(date);

	    // 出力
	    response.setContentType("text/html; charset=UTF-8");
	    PrintWriter out = response.getWriter();
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>今日の★スッキリ★占い</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<p>2022年" + today + "の運勢は◇" + luck + "です</p>");
	    out.println("</body>");
	    out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
