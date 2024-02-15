public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, String surname, int powerOfMagic, int transgressionDistance, int smart, int wise, int witty, int creative) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public void determineTheBest(Ravenclaw ravenclaw) {
        int otherSum = ravenclaw.smart + ravenclaw.wise + ravenclaw.witty + ravenclaw.creative;
        int thisSum = this.smart + this.wise + this.witty + this.creative;
        if (thisSum > otherSum) {
            System.out.println(super.getName() + " лучший Когтевранец, чем " + ravenclaw.getName());
        } else if (thisSum < otherSum) {
            System.out.println(ravenclaw.getName() + " лучший Когтевранец, чем " + super.getName());
        } else {
            System.out.println(ravenclaw.getName() + " и " + super.getName() + " равные по свойствам характера Когтевранцы!");
        }
    }

    @Override
    public void compare(Hogwarts hogwarts) {
        super.compare(hogwarts);
    }
    @Override
    public String toString() {
        return "Факультет Когтевран { " + super.toString() +
                " Ум=" + smart +
                ", Мудрость=" + wise +
                ", Остроумие=" + witty +
                ", Творчество=" + creative +
                "}";
    }
}