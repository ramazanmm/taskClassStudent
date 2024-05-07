public class Human {
    public String name;
    public String surname;
    public int age;
    public String city;

    public Human(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public boolean isStudent() {
        if (age > 18 && age < 25) {
            return true;
        } else {
            return false;
        }
    }
}
