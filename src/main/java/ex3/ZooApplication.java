package ex3;

import static ex3.enums.Alimentation.CARNIVORE;
import static ex3.enums.Alimentation.HERBIVORE;
import static ex3.enums.Alimentation.OMNIVORE;
import static ex3.enums.TypeAnimal.MAMMIFERE;
import static ex3.enums.TypeAnimal.OISEAU;
import static ex3.enums.TypeAnimal.POISSON;
import static ex3.enums.TypeAnimal.REPTILE;

public class ZooApplication {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo("Thoiry");

		zoo.addAnimal(new Animal("Gazelle", MAMMIFERE, HERBIVORE));
		zoo.addAnimal(new Animal("Zèbre", MAMMIFERE, HERBIVORE));
		zoo.addAnimal(new Animal("Lion", MAMMIFERE, HERBIVORE));
		zoo.addAnimal(new Animal("Panthère", MAMMIFERE, CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", POISSON, HERBIVORE));
		zoo.addAnimal(new Animal("Truite dorée", POISSON, HERBIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", REPTILE, CARNIVORE));
		zoo.addAnimal(new Animal("Python", REPTILE, CARNIVORE));

		zoo.afficherListeAnimaux();

	}

}