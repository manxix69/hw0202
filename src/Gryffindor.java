public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, String surname, int powerOfMagic, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public void compare(Hogwarts hogwarts) {
        super.compare(hogwarts);
    }

    public void determineTheBest(Gryffindor gryffindor) {
        int otherSum = gryffindor.courage + gryffindor.honor + gryffindor.nobility;
        int thisSum = this.courage + this.honor + this.nobility;
        if (thisSum > otherSum) {
            System.out.println(super.getName() + " лучший Гриффиндорец, чем " + gryffindor.getName());
        } else if (thisSum < otherSum) {
            System.out.println(gryffindor.getName() + " лучший Гриффиндорец, чем " + super.getName());
        } else {
            System.out.println(gryffindor.getName() + " и " + super.getName() + " равные по свойствам характера Гриффиндорцы!");
        }
    }

    @Override
    public String toString() {
        return "Факультет Гриффиндор { " + super.toString() +
                " Благородство=" + nobility +
                ", Честь=" + honor +
                ", Храбрость=" + courage +
                "}";
    }
}
