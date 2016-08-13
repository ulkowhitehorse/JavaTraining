import ru.ulkowhitehorse.Animal.Animal;
import ru.ulkowhitehorse.Animal.Cat;
import ru.ulkowhitehorse.Animal.Dog;

public class TestMe {
    public static void main(String[] args) {

        Animal [] animals;
        animals = new Animal[5];

        animals[0] = new Cat("Big Sonya",4);
        animals[1] = new Dog("German",6);
        animals[2] = new Cat("Small Sonya",3);

        for (Animal animal:animals
             ) {
            if (animal == null){
                break;
            }
            System.out.println("The cat " + animal.getName() + " " + animal.getAge() + " years old.");
            animal.getAnimal();
            animal.voice();
            animal.run();
            System.out.println("===============================");
        }


    }
}
