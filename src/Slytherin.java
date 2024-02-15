public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name,
                     String surname,
                     int powerOfMagic,
                     int transgressionDistance,
                     int cunning,
                     int determination,
                     int ambition,
                     int resourcefulness,
                     int thirstForPower) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public void determineTheBest(Slytherin slytherin) {
        int otherSum = slytherin.cunning + slytherin.determination + slytherin.ambition + slytherin.resourcefulness + slytherin.thirstForPower;
        int thisSum = this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstForPower;
        if (thisSum > otherSum) {
            System.out.println(super.getName() + " лучший Слизеринец, чем " + slytherin.getName());
        } else if (thisSum < otherSum) {
            System.out.println(slytherin.getName() + " лучший Слизеринец, чем " + super.getName());
        } else {
            System.out.println(slytherin.getName() + " и " + super.getName() + " равные по свойствам характера Слизеринцы!");
        }
    }

    @Override
    public void compare(Hogwarts hogwarts) {
        super.compare(hogwarts);
    }
    @Override
    public String toString() {
        return "Факультет Слизерин { " + super.toString() +
                " Хитрость=" + cunning +
                ", Решительность=" + determination +
                ", Амбициозность=" + ambition +
                ", Находчивость=" + resourcefulness +
                ", Жажда власти=" + thirstForPower +
                "}" ;
    }
}