/**
 * ReportDao.java ct.dao Report 下午9:32:16 2014年2月28日 2014
 */
package ct.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ct.report.Report;

/**
 * @author 东海陈光剑 2014年2月28日 下午9:32:16
 */
public class ReportDao {
	// Report report = new Report();
	private String run_stamp = (new Report()).getRun_stamp();
	// private ArrayList<String> deviceList = (new Report()).getDeviceList();
	// private String device_id = (new Report()).getDevice_id();
	// QueryResult qr = new QueryResult();
	// Map<String, ArrayList<String>> result = (new QueryResult()).query(
	// run_stamp, device_id);
	List<HashMap<String, ArrayList<String>>> result = (new QueryResult())
			.query(run_stamp);

}
