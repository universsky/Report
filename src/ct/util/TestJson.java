/**
 * TestObjectToJson.java ct.util Report ����9:06:52 2014��2��28�� 2014
 */
package ct.util;

import com.google.gson.Gson;

/**
 * @author �����¹⽣ 2014��2��28�� ����9:06:52
 */
public class TestJson {

	/**
	 * @param args
	 *            void main
	 */
	public static void main(String[] args) {
		TestJson obj = new TestJson();
		Gson gson = new Gson();
		String json = gson.toJson(obj);
		System.out.println(json);

		// String json1 = "{'data1':100,'data2':'hello'}";
		// Gson gson1 = new Gson();
		// TestJson obj1 = gson1.fromJson(json1, TestJson.class);
	}

	private int data = 100;
	private String name = "Jack";

}
