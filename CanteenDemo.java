public class CanteenDemo {
    public static void main(String[] args) {
        Item  item1 = new Item();
        item1.name = "Es teh";
        item1.price = 3000;
        item1.stock = 20;
        item1.displayInfo();

        Item item2 = new Item();
        item2.name = "Es Jeruk";
        item2.price = 4000;
        item2.stock = 15;
        item2.displayInfo();

        Item item3 = new Item();
        item3.name = "kopi";
        item3.price = 5000;
        item3.stock = 8;
        item3.displayInfo();

        Item item4 = new Item("Sate ayam", 12000, 5);
    }
    
}
