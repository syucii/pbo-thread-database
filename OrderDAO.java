import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDAO {
    public void saveOrder(Order order) {
        String sql = "INSERT INTO orders (waiter_name, menu_item, quantity) VALUES (?, ?, ?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

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
