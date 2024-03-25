public class RavenClawStudents extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public RavenClawStudents(String name, int magicPower, int transgressionDistance, int smart, int wise, int witty, int fullOfCreativity) {
        super(name, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }
    public void compare(RavenClawStudents second){
        int firstSum = this.getSmart() + this.getWise() + this.getWitty()+ this.getFullOfCreativity();
        int secondSum = second.getSmart() + second.getWise() +second.getWitty() + second.getFullOfCreativity();
        if (firstSum > secondSum) {
            System.out.println(this.getName() + " лучший Когтевранец чем " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " лучший Когтевранец чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + second.getName() + "равны");
        }
    }

    @Override
    public String toString() {
        return getName()+" "
                + " Магическая Сила=" + getMagicPower()
                + " Дальность трансгрессирования=" + getTransgressionDistance() +
                " RavenClawStudents{" +
                " ум=" + smart +
                ", мудрость=" + wise +
                ", остроумие=" + witty +
                ", творческая составляющая=" + fullOfCreativity;
    }
}
