public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, String surname, int powerOfMagic, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public void determineTheBest(Hufflepuff hufflepuff) {
        int otherSum = hufflepuff.hardworking + hufflepuff.loyal + hufflepuff.honest;
        int thisSum = this.hardworking + this.loyal + this.honest;
        if (thisSum > otherSum) {
            System.out.println(super.getName() + " лучший Пуффендуец, чем " + hufflepuff.getName());
        } else if (thisSum < otherSum) {
            System.out.println(hufflepuff.getName() + " лучший Пуффендуец, чем " + super.getName());
        } else {
            System.out.println(hufflepuff.getName() + " и " + super.getName() + " равные по свойствам характера Пуффендуйцы!");
        }
    }

    @Override
    public void compare(Hogwarts hogwarts) {
        super.compare(hogwarts);
    }

    @Override
    public String toString() {
        return "Факультет Пуффендуй { " + super.toString() +
                " Трудолюбие=" + hardworking +
                ", Верность=" + loyal +
                ", Честность=" + honest +
                "}";
    }
}