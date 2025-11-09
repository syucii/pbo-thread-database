import java.util.Random;

public class WaiterThread extends Thread {
    private String waiterName;
    private OrderDAO orderDAO = new OrderDAO();
    private Random random = new Random();

    private static final String[] MENU = {
        "Nasi Goreng", "Ayam Bakar", "Mie Ayam", "Sate Ayam", "Es Teh", "Jus Jeruk"
    };

    public WaiterThread(String waiterName) {
        this.waiterName = waiterName;
    }

    @Override
    public void run() {
        try {
            while (true) {
                // Pilih menu dan jumlah acak
                String menu = MENU[random.nextInt(MENU.length)];
                int qty = 1 + random.nextInt(3);

                Order order = new Order(waiterName, menu, qty);
                orderDAO.saveOrder(order);

                Thread.sleep(4000); // jeda antar pesanan
            }
        } catch (InterruptedException e) {
            System.out.println(waiterName + " berhenti bekerja.");
        }
    }
}
