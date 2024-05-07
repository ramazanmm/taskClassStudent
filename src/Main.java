import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Human human = new Human("Toni", "Kroos", 36, "Madrid");
        System.out.println(human.isStudent());
        Human human1 = new Human("Luka", "Modric", 35, "Madrid");
        System.out.println(human1.isStudent());
        Human human2 = new Human("Federico", "Valvarde", 24, "Madrid");
        System.out.println(human2.isStudent());
        Human human3 = new Human("Eduardo", "Camavinga", 21, "Madrid");
        System.out.println(human3.isStudent());

        Human human4 = new Human("Martin", "Odegard", 25, "London");
        Human human5 = new Human("Jude", "Belhingam", 20, "Madrid");
        Human human6 = new Human("Arda", "Guler", 19, "Madrid");
        Human human7 = new Human("Karim", "Benzema", 36, "Dubay");
        Human human8 = new Human("Cristiano", "Ronaldo", 39, "Dubay");

        Human[] humans = new Human[]{human, human1, human2, human3, human4, human5, human6, human7, human8};
        getCountByCity(humans);
    }

    public static void getCountByCity(Human[] humans) {
        System.out.print("seher daxil edin: ");
        String seher = sc.nextLine();
        for (Human human : humans) {
            if (human.isStudent() && human.city.toLowerCase().contains(seher)) {
                System.out.println("Fullname: " + human.name + human.surname + " Age: " + human.age + " Seher: " + human.city);
            }
        }
    }
}