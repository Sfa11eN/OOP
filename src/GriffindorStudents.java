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

    public void compare(GriffindorStudents second) {
        int firstSum = this.getBravery() + this.getHonor() + this.getNobility();
        int secondSum = second.getBravery() + second.getHonor() + second.getNobility();
        if (firstSum > secondSum) {
            System.out.println(this.getName() + " лучший Гриффиндорец чем " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " лучший гриффиндорец чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + second.getName() + "равны");
        }
    }

    @Override
    public String toString() {
        return getName()+" "
                + " Магическая Сила=" + getMagicPower()
                + " Дальность трансгрессирования=" + getTransgressionDistance() +
                " GriffindorStudents{" +
                " ,благородство=" + nobility +
                ", честь=" + honor +
                ", храбрость=" + bravery;
    }
}
