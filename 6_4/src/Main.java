public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        Basket sukaNahooy = new Basket();
        sukaNahooy.add("Rabotai", 333);
        sukaNahooy.add("GovnoZarabotaiPj", 322);
        basket.add("Milk", 40);
        basket.add("Koprotoshke", 33);
        basket.print("Milk");
        sukaNahooy.print("Huy");
        System.out.println(Basket.getWholeTotalPrice());
        System.out.println(Basket.getAveragePrice());
        System.out.println(Basket.getProductCount());
        System.out.println(Basket.getAverageBasketPrice());
        System.out.println(Basket.getCount());
    }
}
