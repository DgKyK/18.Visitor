public class FaceElement implements Girl {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getMakeUP() {
        return "MakeUP done!!!";
    }
}
