import java.util.Objects;

public class Person {
    private String nameSurname;
    private String pesel;
    private int age;

    public Person(String nameSurname, String pesel, int age) {
        this.nameSurname = nameSurname;
        this.pesel = pesel;
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nameSurname='" + nameSurname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;

        return Objects.equals(pesel, person.pesel);
    }

    @Override
    public int hashCode() {
        return pesel != null ? pesel.hashCode() : 0;
    }
}
