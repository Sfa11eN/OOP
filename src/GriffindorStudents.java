public class GriffindorStudents extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public GriffindorStudents(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String       toString() {
        return getName()
                + "Магическая Сила" + getMagicPower()
                + "Дальность трансмогрификации" + getTransgressionDistance() +
                "GriffindorStudents{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }
}
