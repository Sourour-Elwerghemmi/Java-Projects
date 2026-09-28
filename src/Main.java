public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal("Felidae", "Lion", 5, true);
        Animal animal2 = new Animal("Elephantidae","Elephant", 10, true);
        Animal animal3 = new Animal("Giraffidae", "Girafe", 7, true);

        Animal[] animals = new Animal[25];
        animals[0] = animal1;
        animals[1] = animal2;
        animals[2] = animal3;

        Zoo myZoo = new Zoo(
                animals,
                "Zoo de Tunis",
                "Tunis",
                20
        );
        myZoo.displayZoo(); // Affichage du zoo
        System.out.println(myZoo); // Affichage avec toString()
        System.out.println(animal1); // Affichage d'un animal
    }
}