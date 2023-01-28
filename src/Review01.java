public class Review01 {

    public static void main(String[] args) {
        int priceValue = 1500;
        int taxValue = tax(priceValue);
        System.out.println(priceValue + "円の商品の税込価格は" + (priceValue + taxValue) + "円（消費税は" + taxValue + "円）です。");
    }

    public static int tax(int price) {
        int taxRate = 10;
        double taxValue = price * (taxRate / 100.0d);
        return (int)taxValue;
    }
}
