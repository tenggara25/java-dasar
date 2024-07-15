public class Activity1 {
    public static void main(String[] args) {
        var Amount = 1000;
        var TotalPrice = Amount * 2.5;
        var Discount = 0.2;
        var FinalPrice = TotalPrice - TotalPrice * Discount;
        var Name = "Mr. Bulmer ";
        System.out.println("Hello " + Name + "your purchase : " + FinalPrice);
    }
}
