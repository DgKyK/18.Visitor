public class TestClass {
    public static void main(String[] args) {
        Girl Anna = new BeatifulBaby();
        Visitor friend = new GirlFriend();
        Visitor stylist = new Stylist();

        //Anna.accept(friend);
        Anna.accept(stylist);
    }
}
