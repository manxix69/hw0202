public class Hogwarts {

    private String name;
    private String surname;

    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String name, String surname, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public void compare(Hogwarts hogwarts) {
        if (hogwarts.powerOfMagic > this.powerOfMagic)
            System.out.println(hogwarts.name + " " + hogwarts.surname + " обладает большей мощностью магии, чем " + this.name + " " + this.surname + ".");
        else if (hogwarts.powerOfMagic < this.powerOfMagic) {
            System.out.println(this.name + " " + this.surname + " обладает большей мощностью магии, чем " + hogwarts.name + " " + hogwarts.surname + ".");
        } else {
            System.out.println(this.name + " " + this.surname + " и " + hogwarts.name + " " + hogwarts.surname + " обладают равной силой магии");
        }
        if (hogwarts.transgressionDistance > this.transgressionDistance)
            System.out.println(hogwarts.name + " " + hogwarts.surname + " умеет на большее расстояние трансгрессировать, чем " + this.name + " " + this.surname + ".");
        else if (hogwarts.transgressionDistance < this.transgressionDistance) {
            System.out.println(this.name + " " + this.surname + " умеет на большее расстояние трансгрессировать, чем " + hogwarts.name + " " + hogwarts.surname + ".");
        } else {
            System.out.println(this.name + " " + this.surname + " и " + hogwarts.name + " " + hogwarts.surname + " обладают равными навыками трансгрессировать");
        }
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    @Override
    public String toString() {
        return "Ученик {" +
                " Имя='" + name + '\'' +
                ", Фамилия='" + surname + '\'' +
                ", Сила магии =" + powerOfMagic +
                ", Расстояние трансгрессии=" + transgressionDistance +
                '}';
    }
}