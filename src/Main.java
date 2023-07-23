public class Main {
    public static void main(String[] args) {
        Cow cow1 = new Cow(1,11,21,"bora1");
        Cow cow2 = new Cow(2,12,22,"bora2");
        Cow cow3 = new Cow(3,13,23,"bora3");
        Cow cow4 = new Cow(4,14,24,"bora4");
        Cow cow5 = new Cow(5,15,25,"bora5");

        Sheep sheep1 = new Sheep( 31,41,51,"miki1");
        Sheep sheep2 = new Sheep( 32,42,52,"miki2");
        Sheep sheep3 = new Sheep( 33,43,53,"miki3");

        Horse horse1 = new Horse(61,71,81,"hors1");
        Horse horse2 = new Horse(62,72,82,"hors2");


        Farm farms1 =new Farm ("osh",
                                new Sheep [] {sheep1,sheep2,sheep3},
                                 new Cow[]{cow1, cow2, cow3, cow4, cow5},
                                 new Horse[] {horse1, horse2},
                                  "jek1"
                                );

        Farm  farms2 = new Farm ("osh",
                                    new Sheep [] {sheep1},
                                    new Cow[]{ cow1},
                                    new Horse[]{ horse1},
                                    "jek"
                                    );
        System.out.println(farms2);
        System.out.println();
        System.out.println(farms1);
    }
}