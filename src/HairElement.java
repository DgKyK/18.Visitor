public class HairElement implements Girl{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getHairDress() {
        return "HairDress done!!!";
    }
}
