import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();
        do {
            System.out.print("Donner le nombre de cages : ");
            zoo.nbrCages = scanner.nextInt();

            if (zoo.nbrCages <= 0) {
                System.out.println("Le nombre de cages doit être positif.");
            }

        } while (zoo.nbrCages <= 0);
        scanner.nextLine();
        do {
            System.out.print("Donner le nom du zoo : ");
            zoo.zooName = scanner.nextLine();
            if (zoo.zooName.trim().isEmpty()) {
                System.out.println("Le nom du zoo ne peut pas être vide.");
            }
        } while (zoo.zooName.trim().isEmpty());

        System.out.println("Le zoo " + zoo.zooName + " contient " + zoo.nbrCages + " cages.");
        scanner.close();
    }
}
