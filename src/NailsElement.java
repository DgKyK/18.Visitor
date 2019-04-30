public class NailsElement implements Girl {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getManicure() {
        return "Manicure done!!!";
    }
}
