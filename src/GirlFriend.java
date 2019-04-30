public class GirlFriend implements Visitor {


    @Override
    public void visit(HairElement hair) {
        System.out.println("Make not bad hair style\n" + hair.getHairDress());
    }

    @Override
    public void visit(FaceElement face) {
        System.out.println("Make not bad MakeUp\n" + face.getMakeUP());
    }

    @Override
    public void visit(NailsElement nails) {
        System.out.println("Make not bad manicure\n" + nails.getManicure());
    }

    @Override
    public void visit(BeatifulBaby baby) {
        System.out.println(baby.getReady());
    }
}
