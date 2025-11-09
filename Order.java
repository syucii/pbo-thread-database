public class Order {
    private String waiterName;
    private String menuItem;
    private int quantity;

    public Order(String waiterName, String menuItem, int quantity) {
        this.waiterName = waiterName;
        this.menuItem = menuItem;
        this.quantity = quantity;
    }
    // Getter methods
    public String getWaiterName() { return waiterName; }
    public String getMenuItem() { return menuItem; }
    public int getQuantity() { return quantity; }
}
