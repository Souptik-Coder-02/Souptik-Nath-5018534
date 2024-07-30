public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("MobileApp1");
        Observer webApp1 = new WebApp("WebApp1");

        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(webApp1);

        System.out.println("Setting stock price to 100");
        stockMarket.setPrice(100.00);

        System.out.println("Setting stock price to 200");
        stockMarket.setPrice(200.00);
    }
}
