public class HufflepuffStudents extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public HufflepuffStudents(String name, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
public void compare(HufflepuffStudents second){
    int firstSum = this.getHardworking() + this.getLoyal() + this.getHonest();
    int secondSum = second.getHardworking() + second.getLoyal() + second.getHonest();
    if (firstSum > secondSum) {
        System.out.println(this.getName() + " лучший Пуффендуец чем " + second.getName());
    } else if (secondSum > firstSum) {
        System.out.println(second.getName() + " лучший Пуффендуец чем " + this.getName());
    } else {
        System.out.println(this.getName() + " и " + second.getName() + "равны");
    }
}

    @Override
    public String toString() {
        return getName()+" "
                + " Магическая Сила=" + getMagicPower()
                + " Дальность трансгрессирования=" + getTransgressionDistance() +
                " ,HufflepuffStudents{" +
                " ,трудолюбие=" + hardworking +
                ", верность=" + loyal +
                ", чесность=" + honest;
    }
}
