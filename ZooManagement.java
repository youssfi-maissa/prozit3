package zoo;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Parc Animalier", "Tunis");
        Zoo zoo2 = new Zoo("Friguia Park", "Sousse");

        Animal lion = new Animal("Félidé", "Lion", 5, true);
        Animal tigre = new Animal("Félidé", "Tigre", 4, true);
        Animal lion2 = new Animal("Félidé", "Lion", 6, true);

        zoo1.addAnimal(lion);
        zoo1.addAnimal(tigre);
        zoo1.addAnimal(lion2);

        System.out.println("\nAnimaux du zoo 1 :");
        zoo1.displayAnimals();

        System.out.println("\nRésultat de la recherche de Lion : " + zoo1.searchAnimal(lion));
        System.out.println("Suppression du Tigre : " + zoo1.removeAnimal(tigre));

        System.out.println("\nAnimaux restants :");
        zoo1.displayAnimals();

        zoo2.addAnimal(new Animal("Canidé", "Chacal", 2, true));
        Zoo meilleurZoo = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("\nLe zoo avec le plus d'animaux est : " + meilleurZoo);
    }
}
