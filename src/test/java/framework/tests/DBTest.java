package framework.tests;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import framework.utilities.DBUtil;

public class DBTest {

	public static void main(String[] args) throws SQLException {
		
		List<Map<String, String>> data = DBUtil.getData("SELECT * FROM FILM ORDER BY FILM_ID ASC LIMIT 100");
		
		System.out.println(data.get(1).get("title"));
		System.out.println(data.get(1).get("description"));

	}

}
