import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class randomlist
 */
@WebServlet("/randomlist")
public class randomlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public randomlist() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // HTMLを出力
	    response.setContentType("text/html; charset=UTF-8");
	    PrintWriter out = response.getWriter();
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>ランダムリストプログラム</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<div>");

	 	int n = (int) (Math.random()*101);// 乱数

	    out.println("<p>" + n + "人分出力</p>");
	    for (int i = 1; i <= n; i++) {
	    	if (i < 10) {
	    		out.println("&nbsp&nbsp" + i + "人目<br>");
	    	}else {
	    		out.println(i + "人目<br>");
	    	}
	    }

	    out.println("</div>");
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