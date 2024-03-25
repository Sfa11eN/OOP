public class Hogwarts {
    private String name;
    private int MagicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        MagicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return MagicPower;
    }

    public void setMagicPower(int magicPower) {
        MagicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public void compareAnyStudents(Hogwarts second) {
        if (this.getMagicPower() > second.getMagicPower()) {
            System.out.println(this.getName() + " обладает большей магической силой чем " + second.getName());
        } else if (second.getMagicPower() > this.getMagicPower()) {
            System.out.println(second.getName() + " обладает большей магической силой чем " + this.getName());
        } else {
            System.out.println(second.getName() + "и " + this.getName() + " равны по силе магии");
        }
        if (this.getTransgressionDistance() > second.getTransgressionDistance()) {
            System.out.println(this.getName() + " обладает большей дальностью трансгрессирования чем " + second.getName());
        } else if (second.getTransgressionDistance() > this.getTransgressionDistance()) {
            System.out.println(second.getName() + " обладает большей дальностью трансгрессирования чем " + this.getName());
        } else {
            System.out.println(second.getName() + "и " + this.getName() + " имеют одинаковую дальность трансгрессирования");

        }
        }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", MagicPower=" + MagicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}

