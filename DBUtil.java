import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/restaurant_db"; // alamat database
    private static final String USER = "root";   // username database
    private static final String PASS = "";       

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS); // membuat koneksi ke database
    }
}
