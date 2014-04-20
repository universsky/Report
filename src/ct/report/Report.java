/**
 * Report.java ct.report Report 下午7:38:18 2014年2月28日 2014
 */
package ct.report;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import ct.dao.ReportDao;

/**
 * @author 东海陈光剑 2014年2月28日 下午7:38:18
 */
public class Report extends HttpServlet {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = -7282812094112943289L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		run_stamp = req.getParameter("run_stamp");
		callback = req.getParameter("callback");

		ReportDao dao = new ReportDao();
		Gson gson = new Gson();
		String json = gson.toJson(dao);
		// 在console上打印记录
		System.out.println(callback + "(" + json + ")");
		PrintWriter out = resp.getWriter();
		out.print(callback + "(" + json + ")");
		out.flush();
	}

	public String getRun_stamp() {
		return run_stamp;
	}

	public void setRun_stamp(String run_stamp) {
		Report.run_stamp = run_stamp;
	}

	static String run_stamp;
	static String callback;

}
