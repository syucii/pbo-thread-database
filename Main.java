public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistem Pemantauan Order Restoran ===");

        // Membuat thread untuk setiap pelayan
        WaiterThread waiter1 = new WaiterThread("Andi");
        WaiterThread waiter2 = new WaiterThread("Budi");
        WaiterThread waiter3 = new WaiterThread("Citra");

        // Menjalankan semua thread secara paralel
        waiter1.start();
        waiter2.start();
        waiter3.start();
    }
}
