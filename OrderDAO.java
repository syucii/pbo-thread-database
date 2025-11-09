import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// method untuk menyimpan pesanan ke database
public class OrderDAO {
    public void saveOrder(Order order) {
        String sql = "INSERT INTO orders (waiter_name, menu_item, quantity) VALUES (?, ?, ?)";
        // koneksi dan statement tertutup otomatis setelah digkan
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            // set parameter dan eksekusi
            ps.setString(1, order.getWaiterName());
            ps.setString(2, order.getMenuItem());
            ps.setInt(3, order.getQuantity());
            ps.executeUpdate();

            System.out.println("Pesanan disimpan oleh " + order.getWaiterName()
                + ": " + order.getMenuItem() + " x" + order.getQuantity());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
