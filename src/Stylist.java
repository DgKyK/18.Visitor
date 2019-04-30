public class Stylist implements Visitor {
    @Override
    public void visit(HairElement hair) {
        System.out.println("Make professional hairdress\n" + hair.getHairDress());
    }

    @Override
    public void visit(FaceElement face) {
        System.out.println("Make professional make up\n" + face.getMakeUP());
    }

    @Override
    public void visit(NailsElement nails) {
        System.out.println("Make professional manicure\n" + nails.getManicure());
    }

    @Override
    public void visit(BeatifulBaby baby) {
        System.out.println(baby.getReady());
    }
}
