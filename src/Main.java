
public class Main {
    public static void main(String[] args) {
        System.out.println("ООП");

        GriffindorStudents harryPotter = new GriffindorStudents(
                " Гарри Поттер",
                89,
                70,
                70,
                85,
                90
        );
        GriffindorStudents hermionaGrangers = new GriffindorStudents(
                " Гермиона Грейнджерс",
                80,
                80,
                65,
                80,
                80
        );
        SlytherinStudents drakoMalfoy = new SlytherinStudents(
                " Драко Малфой",
                75,
                80,
                65,
                50,
                80,
                70,
                80
        );
        HufflepuffStudents sedrickDiggory = new HufflepuffStudents(
                " Седрик Диггори",
                80,
                75,
                70,
                80,
                80
        );

        RavenClawStudents padmaPatil = new RavenClawStudents(
                " Падма Патил",
                75,
                60,
                80,
                80,
                75,
                90
        );
        RavenClawStudents chjouChang = new RavenClawStudents(
                " Чжоу Чанг",
                65,
                70,
                70,
                70,
                78,
                80
        );
        System.out.println(harryPotter);
        System.out.println(hermionaGrangers);
        System.out.println(drakoMalfoy);
        System.out.println(sedrickDiggory);
        System.out.println(padmaPatil);

        harryPotter.compare(hermionaGrangers);
        padmaPatil.compare(chjouChang);
        drakoMalfoy.compareAnyStudents(sedrickDiggory);
        padmaPatil.compareAnyStudents(hermionaGrangers);



    }


}