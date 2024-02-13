public class Main {
    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Harry", "Potter", 87, 100, 85, 97, 80);
        Gryffindor ron = new Gryffindor("Ron", "Weasley", 55, 34, 89, 56, 85);
        Gryffindor germione = new Gryffindor("Hermione", "Granger", 56, 65, 25, 78, 35);

        Slytherin draco = new Slytherin("Draco", "Malfoy", 70, 77, 89, 19, 3, 12, 89);
        Slytherin graham = new Slytherin("Graham", "Montague", 35, 45, 55, 10, 3, 45, 20);
        Slytherin gregory = new Slytherin("Gregory", "Goyle", 25, 10, 50, 10, 3, 0, 12);

        Hufflepuff zachariah = new Hufflepuff("Zachariah", "Smith", 23, 53, 99, 54, 88);
        Hufflepuff cedric = new Hufflepuff("Cedric", "Diggory", 89, 75, 55, 90, 68);
        Hufflepuff justin = new Hufflepuff("Justin", "Finch-Fletchley", 55, 53, 75, 55, 78);

        Ravenclaw zhou = new Ravenclaw("Zhou", "Chang", 55, 66, 36, 88, 70, 55);
        Ravenclaw padma = new Ravenclaw("Padma", "Patil", 35, 41, 30, 60, 55, 35);
        Ravenclaw marcus = new Ravenclaw("Marcus", "Belby", 77, 23, 32, 55, 75, 45);

        Hogwarts[] hogwarts = new Hogwarts[]{harry, ron, germione, draco, graham, gregory, zachariah, cedric, justin, zhou, padma, marcus};

        byte[][] map = new byte[hogwarts.length][hogwarts.length];

//        System.out.println(harry);
//        System.out.println(draco);
//        System.out.println("тест печати");
//        harry.determineTheBest(ron);
//        harry.compare(ron);

        for (int i = 0; i < hogwarts.length; i++) {
            System.out.print("------>");
            System.out.println(hogwarts[i]);
            for (int j = i; j < hogwarts.length; j++) {
                if (hogwarts[i] != hogwarts[j] && (map[j][i] != 1)) {
                    if (hogwarts[i] instanceof Gryffindor && hogwarts[j] instanceof Gryffindor) {
                        ((Gryffindor) hogwarts[i]).determineTheBest((Gryffindor) hogwarts[j]);
                    } else if (hogwarts[i] instanceof Hufflepuff && hogwarts[j] instanceof Hufflepuff) {
                        ((Hufflepuff) hogwarts[i]).determineTheBest((Hufflepuff) hogwarts[j]);
                    } else if (hogwarts[i] instanceof Ravenclaw && hogwarts[j] instanceof Ravenclaw) {
                        ((Ravenclaw) hogwarts[i]).determineTheBest((Ravenclaw) hogwarts[j]);
                    } else if (hogwarts[i] instanceof Slytherin && hogwarts[j] instanceof Slytherin) {
                        ((Slytherin) hogwarts[i]).determineTheBest((Slytherin) hogwarts[j]);
                    }
                    hogwarts[i].compare(hogwarts[j]);
                }
                map[j][i] = 1;
            }
            System.out.println("<------");
        }
    }
}