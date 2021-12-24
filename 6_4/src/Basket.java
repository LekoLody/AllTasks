public class Basket {

    private static int count = 0;


    private static int productCount = 0;

    public static int getWholeTotalPrice() {
        return wholeTotalPrice;
    }

    private static int wholeTotalPrice = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private static int averagePrice = 0;

    public static int getProductCount() {
        return productCount;
    }

    public static void increaseProductCount(int productCount) {
        Basket.productCount = Basket.productCount + productCount;
    }

    public static int getAveragePrice() {
        averagePrice = wholeTotalPrice / count;
        return averagePrice;
    }

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        increaseCount(1);
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        increaseCount(1);
        increaseProductCount(1);
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
        wholeTotalPrice = wholeTotalPrice + totalPrice;
    }

    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        increaseProductCount(1);


        items = items + "\n" + name + " - " +
                count + " шт. - " + price;
        totalPrice = totalPrice + count * price;

    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}