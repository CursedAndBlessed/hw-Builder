import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private String adress;
    private int age;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, String adress) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
    }

    public Person(String name, String surname, String adress, int age) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.age = age;
    }

    public boolean hasAge() {
        return age >= 0;
    }
    public boolean hasAddress() {
        if (this.adress != null) return true;
        else return false;
    }
    public void happyBirthday() {
        this.age++;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        String text = name + " " + surname + " " + age + " год(а)/лет " +
                "из г. " + adress;
        return text;
    }
    public PersonBuilder newChildBuilder() {
        PersonBuilder builder = new PersonBuilder()
                .setSurname(this.getSurname())
                .setAdress(this.getAdress())
                .setAge(0);
        return builder;
    }
}
