package db.mysql;

public class MySQLDBUtil {
	private static final String HOSTNAME = "localhost";
	private static final String PORT_NUM = "3306"; // 3306 on server and 3307 on local
	public static final String DB_NAME = "db_eventRec";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	public static final String URL = "jdbc:mysql://" + HOSTNAME + ":" + PORT_NUM + "/" + DB_NAME
			+ "?user=" + USERNAME + "&password=" + PASSWORD + "&autoreconnect=true";
}
