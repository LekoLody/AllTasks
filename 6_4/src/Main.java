public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        Basket sukaNahooy = new Basket();
        sukaNahooy.add("Rabotai", 333);
        basket.add("Milk", 40);
        basket.add("Koprotoshke", 33);
        basket.print("Milk");
        System.out.println(Basket.getAveragePrice());
        System.out.println(Basket.wholeTotalPrice());
        System.out.println(Basket.getProductCount());
    }
}
