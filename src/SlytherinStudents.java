public class SlytherinStudents extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public SlytherinStudents(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    public void compare(SlytherinStudents second){
        int firstSum = this.getCunning() + this.getDetermination() + this.getAmbition()+ this.getResourcefulness()+this.getThirstForPower();
        int secondSum = second.getCunning() + second.getDetermination() + second.getAmbition()+ second.getResourcefulness()+second.getThirstForPower();
        if (firstSum > secondSum) {
            System.out.println(this.getName() + " лучший Слизеринец чем " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " лучший Слизеринец чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + second.getName() + "равны");
        }
    }

    @Override
    public String toString() {
        return getName()+" "
                + " Магическая Сила=" + getMagicPower()
                + " Дальность трансгрессирования=" + getTransgressionDistance() +
                " SlytherinStudents{" +
                " хитрость=" + cunning +
                ", решительность=" + determination +
                ", амбициозность=" + ambition +
                ", находчивость=" + resourcefulness +
                ", жажда власти=" + thirstForPower;
    }
}
