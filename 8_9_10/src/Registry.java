import java.util.ArrayList;
import java.util.List;

public class Registry {

    private List<Animal> pets;
    private List<Animal> pack;


    public Registry() {
        this.pets = new ArrayList<>();
        this.pack = new ArrayList<>();
    }

    public void addPetsAnimals(Animal animal) {
        pets.add(animal);
    }

    public void addPackAnimals(Animal animal) {
        pack.add(animal);
    }

    public void printAllAnimals() {
        if (pets.isEmpty() && pack.isEmpty()) {
            System.out.println("Список животных пуст");
        } else {
            System.out.println("Список всех животных:");
            for (Animal animal : pets) {
                System.out.println("Домашнее животное: " + animal);
            }
            for (Animal animal : pack) {
                System.out.println("Вьючное животное: " + animal);
            }
            System.out.println("Всего животных: " + (pets.size() + pack.size()) + "\n" +
                    "Домашних животных: " + pets.size() + "\n" +
                    "Вьючных животных: " + pack.size());
        }
    }
}
