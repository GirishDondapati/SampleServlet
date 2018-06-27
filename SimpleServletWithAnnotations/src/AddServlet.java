import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int val1 = Integer.parseInt(req.getParameter("t1"));
		int val2 = Integer.parseInt(req.getParameter("t2"));
		
		int sum = val1 + val2;
		
		PrintWriter out = res.getWriter();
		out.print("Sum of given two values is: "+sum);
	}
}
