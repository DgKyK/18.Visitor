import java.util.ArrayList;
import java.util.List;

public class BeatifulBaby implements Girl{
    private List<Girl> elements;

    public BeatifulBaby() {
        this.elements = new ArrayList<>();
        elements.add(new FaceElement());
        elements.add(new HairElement());
        elements.add(new NailsElement());
    }

    @Override
    public void accept(Visitor visitor) {
        for (Girl k : elements) {
            k.accept(visitor);
        }
        visitor.visit(this);
    }

    public String getReady() {
        return "I`m ready , honey";
    }
}
